/**
 *
 */
package dicom_waveforms

import org.dcm4che2.data.DicomObject
import org.dcm4che2.data.SequenceDicomElement
import org.dcm4che2.data.SimpleDicomElement
import org.dcm4che2.io.DicomInputStream
import org.dcm4che2.data.Tag
import org.dcm4che2.data.VR

/**
 * @author Pablo Pazos <pablo.pazos@cabolabs.com>
 *
 * LICENSE: do whatever you want, just keep attribution of original author.
 *
 * $ groovy -cp "./dcm4che-2.0.29/lib/*" src/dicom_waveforms/AnalyzeDCM.groovy
 *
 */
class AnalyzeDCM {

   static main(args) {

      DicomObject dcmObj;
      DicomInputStream din = null;
      try {
         din = new DicomInputStream(new File("resources/Example.dcm"));
         dcmObj = din.readDicomObject(); // BasicDicomObject

         println dcmObj

         // https://www.dcm4che.org/docs/dcm4che2-apidocs/org/dcm4che2/data/Tag.html
         println dcmObj.get(Tag.StudyID); // DicomElement
         println dcmObj.get(Tag.AccessionNumber);
         println dcmObj.get(Tag.StudyInstanceUID);
         println dcmObj.get(Tag.StudyTime);
         println dcmObj.get(Tag.PatientID);
         println dcmObj.get(Tag.Modality); // ECG
         println dcmObj.bigEndian() // false


         println dcmObj.getFloat(Tag.DACAmplitude)
         println dcmObj.getFloat(Tag.DACGainPoints)
         println dcmObj.getFloat(Tag.DACSequence)
         println dcmObj.getFloat(Tag.DACTimePoints)
         println dcmObj.getFloat(Tag.DACType)
         println dcmObj.getFloat(Tag.TimeOfGainCalibration)

         //println dcmObj.get(Tag.NumberOfWaveformChannels);
         //println dcmObj.get(Tag.NumberOfWaveformSamples);
         //println dcmObj.get(Tag.ReferencedWaveformChannels);
         //println dcmObj.get(Tag.ReferencedWaveformSequence);
         //println dcmObj.get(Tag.RWavePointer);
         //println dcmObj.get(Tag.RWaveTimeVector);
         //println dcmObj.get(Tag.SourceWaveformSequence);

         //println dcmObj.get(Tag.WaveformData); // null
         //println dcmObj.get(Tag.WaveformChannelNumber);
         //println dcmObj.get(Tag.WaveformPaddingValue);

         // WaveformSequence contains
         //   WaveFormSequenceItem (1..5) contains
         //     WaveformData, ChannelDefinitionSequence contains
         //       Channels (1..13) contains
         //         ChannelSourceSequence, ChannelSensitivityUnitSequence

         // WaveformSequence items should be 1..5 by the spec
         //println dcmObj.get(Tag.WaveformSequence); // (5400,0100) SQ #-1 [2 items]
         //println dcmObj.get(Tag.WaveformSequence).getClass() // org.dcm4che2.data.SequenceDicomElement
         // https://sourceforge.net/p/dcm4che/svn/792/tree/dcm4che2/trunk/dcm4che-core/src/main/java/org/dcm4che2/data/SequenceDicomElement.java
         //println dcmObj.get(Tag.WaveformSequence).countItems() // 2

         SequenceDicomElement waveformSequence = dcmObj.get(Tag.WaveformSequence)
         assert waveformSequence.countItems() in 1..5

         // Aunque sea SQ la comparacion da false, value representation = sequence (DICOM datatype)
         //println waveformSequence.vr().getClass() // org.dcm4che2.data.VR$SQ
         //println waveformSequence.vr() == VR.SQ // false ?
         //println waveformSequence.vr().equals(VR.SQ) // false ?


         DicomObject waveformItem
         def waveformData
         byte[] data // 8 bit
         short[] datas // 16 bit
         SequenceDicomElement channelDefinitionSeq
         DicomObject channel
         SequenceDicomElement channelSourceSeq
         SequenceDicomElement channelSensitivityUnitSeq
         for (int i=0; i<waveformSequence.countItems(); i++)
         {
            //println dcmObj.get(Tag.WaveformSequence).getDicomObject(i).getClass() // BasicDicomObject
            waveformItem = waveformSequence.getDicomObject(i)

            println "> waveform item "+ i


            // DATA!
            waveformData = waveformItem.get(Tag.WaveformData)
            println waveformData // VR = OW (other word string)
            println waveformData.getClass()
            println "waveform data length "+ waveformData.length() // number of bytes in the waveform data byte array
            //println waveformItem.getBytes(Tag.WaveformData).length
            //println waveformItem.get(Tag.WaveformData).getClass() // SimpleDicomElement
            //println waveformItem.getBytes(Tag.WaveformData) // BYTES!!!

            // intento decodificar los canales (deberia ser el primer byte de los 2 bytes)
            /*
            data = waveformItem.getBytes(Tag.WaveformData)
            for (int c=0; c<200; c+=2)
            {
               println data[c] +' '+ data[c+1]
            }
            */

            def chartTest = []

            float freq = waveformItem.getFloat(Tag.SamplingFrequency) // Decimal String / Float

            //println waveformItem.getFloat(Tag.SamplingFrequency)


            datas = waveformItem.getShorts(Tag.WaveformData)
            int muestra
            for (int c=0; c<5000; c+=12)
            {
               muestra = c/12
               print muestra/freq + 's: '
               (0..11).each{
                  print datas[c + it] +' '
               }

               chartTest << datas[c+1]

               println ""
            }

            // copied the data to a highcharts demo and looks OK!
            //println chartTest
            //https://codepen.io/anon/pen/BqbdVp


            /* da vuelta los bytes no los bits
            println "cambio endian"

            org.dcm4che2.util.ByteUtils.toggleShortEndian(data)

            for (int c=0; c<200; c+=2)
            {
               println data[c] +' '+ data[c+1]
            }
            */

            // Como interpretar las datos
            // ftp://medical.nema.org/medical/dicom/final/sup30_f2.pdf
            // C.10.9.1.5

            // largo
            println waveformItem.get(Tag.WaveformBitsAllocated) // 8 o 16

            // interpretacion
            // 8/SB=signed 8 bit linear
            // 8/UB=unsigned 8 bit linear
            // 8/MB=8 bit mu-law
            // 8/AB=8 bit A-law
            // 16/SS=signed 16 bit linear
            // 16/US=unsigned 16 bit linear
            println waveformItem.get(Tag.WaveformSampleInterpretation) // SS


            //println waveformItem.get(Tag.NumberOfChannels) // null
            println waveformItem.get(Tag.NumberOfWaveformChannels) // 12 in 1..13
            println waveformItem.get(Tag.NumberOfWaveformSamples) // 4999 <= 16384
            println waveformItem.get(Tag.SamplingFrequency) // 500 Hz? in 200..1000

            channelDefinitionSeq = waveformItem.get(Tag.ChannelDefinitionSequence)

            //println channelDefinitionSeq // SQ
            //println channelDefinitionSeq.getClass() // class org.dcm4che2.data.SequenceDicomElement
            //println channelDefinitionSeq.countItems() // 12


            for (int j=0; j<channelDefinitionSeq.countItems(); j++)
            {
               println "  > channel "+ j
               channel = channelDefinitionSeq.getDicomObject(j)
               //println channel
               //println channel.getClass() // BasicDicomObject
               //println channel.size() // 7

               println channel.getItemOffset()

               println channel.get(Tag.ChannelSensitivity) // 2.5 (uV)
               println channel.get(Tag.ChannelBaseline) // 0
               println channel.get(Tag.WaveformBitsStored) // 16

               channelSourceSeq = channel.get(Tag.ChannelSourceSequence) // SequenceDicomElement

               for (int k=0; k<channelSourceSeq.countItems(); k++)
               {
                  println "    > channel source "+ k
                  println channelSourceSeq.getDicomObject(k)
                  //println channelSourceSeq.getDicomObject(k).getClass() // BasicDicomObject
                  //println channelSourceSeq.getDicomObject(k).size() // 4

                  //(0008,0100) SH #10 [5.6.3-9-8] Code Value
                  //(0008,0102) SH #6 [SCPECG] Coding Scheme Designator
                  //(0008,0103) SH #4 [1.3] Coding Scheme Version
                  //(0008,0104) LO #8 [Lead V6] Code Meaning
               }

               println channel.get(Tag.ChannelSensitivity) // 2.5 (uV)
               println channel.get(Tag.ChannelSensitivityCorrectionFactor)

               channelSensitivityUnitSeq = channel.get(Tag.ChannelSensitivityUnitsSequence)

               for (int k=0; k<channelSensitivityUnitSeq.countItems(); k++)
               {
                  println "    > channel sensitivity "+ k
                  println channelSensitivityUnitSeq.getDicomObject(k)

                  //(0008,0100) SH #2 [uV] Code Value
                  //(0008,0102) SH #4 [UCUM] Coding Scheme Designator
                  //(0008,0103) SH #4 [1.4] Coding Scheme Version
                  //(0008,0104) LO #10 [microvolt] Code Meaning
               }


               //println channel.get(Tag.CodingSchemeDesignator) // null
               //println channel.get(Tag.CodeMeaning) // null

               //println channel.get(Tag.ChannelDefinitionSequence) // null

               println ""
            }

            println ""
         }

         println "------------"

         //println dcmObj
         //println "------------"

         /*
         println dcmObj.dataset();
         println dcmObj.dataset().get(Tag.WaveformData);
         println dcmObj.dataset().get(Tag.WaveformSequence); // (5400,0100) SQ #-1 [2 items]
         println dcmObj.dataset().get(Tag.NumberOfWaveformSamples);
         */

         println "fin"
      }
      catch (IOException e) {
         e.printStackTrace();
         return;
      }
      finally {
         try {
            din.close();
         }
         catch (IOException ignore) {}
      }

      /* DCMSND
       *
       * FileInfo info = new FileInfo(f);
        DicomObject dcmObj = new BasicDicomObject();
        DicomInputStream in = null;
        try {
            in = new DicomInputStream(f);
            in.setHandler(new StopTagInputHandler(Tag.StudyDate));
            in.readDicomObject(dcmObj, PEEK_LEN);
            info.tsuid = in.getTransferSyntax().uid();
            info.fmiEndPos = in.getEndOfFileMetaInfoPosition();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("WARNING: Failed to parse " + f + " - skipped.");
            System.out.print('F');
            return;
        } finally {
            CloseUtils.safeClose(in);
        }
        info.cuid = dcmObj.getString(Tag.MediaStorageSOPClassUID,
                dcmObj.getString(Tag.SOPClassUID));
        if (info.cuid == null) {
            System.err.println("WARNING: Missing SOP Class UID in " + f
                    + " - skipped.");
            System.out.print('F');
            return;
        }
        info.iuid = dcmObj.getString(Tag.MediaStorageSOPInstanceUID,
                dcmObj.getString(Tag.SOPInstanceUID));
        if (info.iuid == null) {
            System.err.println("WARNING: Missing SOP Instance UID in " + f
                    + " - skipped.");
            System.out.print('F');
            return;
        }
        if (suffixUID != null)
            info.iuid = info.iuid + suffixUID[0];
        addTransferCapability(info.cuid, info.tsuid);
        files.add(info);
        System.out.print('.');
       *
       *
       */
   }
}
