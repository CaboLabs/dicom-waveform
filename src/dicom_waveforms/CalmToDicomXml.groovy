package dicom_waveforms

class CalmToDicomXml {

   static float CALM_CHANNEL_SENSIT = 0.732421875

   static main(args)
   {
      if (args.size() < 2)
      {
         println 'Usage: groovy -cp "./lib/*" src/dicom_waveforms/CalmToDicomXml.groovy input_file output_file'
         return
      }

      def input = new File(args[0])
      def t = input.text
      def lines = t.split("\n")
      def mv_values = lines.collect{ Float.parseFloat( it.split(",")[1] ) }

      short raw_value
      int xml_encoded_value
      StringBuilder encoded_values_builder = new StringBuilder()
      mv_values.each {
         raw_value = mVolt2RawChSensit(it, CALM_CHANNEL_SENSIT)
         xml_encoded_value = byteArray2uShort(short2ByteArray(raw_value))
         //println xml_encoded_value

         encoded_values_builder.append(xml_encoded_value.toString())
         encoded_values_builder.append("\\")
      }

      // removes last \
      encoded_values_builder.setLength(encoded_values_builder.length() - 1)

      def template = new XmlParser().parse('resources/dcm_1_lead_template_attr_tags.xml')
      //println template.tag54000100[0].item[0].tag54001010[0].value().getClass()
      //println template.tag54000100[0].item[0].tag54001010[0].text()

      /* Modifications for explicit tag template
      // waveform samples
      template.tag54000100[0].item[0].tag003A0010[0].value = mv_values.size()

      // sampling frequency
      template.tag54000100[0].item[0].tag003A001A[0].value = 200

      // channel sensitivity
      template.tag54000100[0].item[0].tag003A0200[0].item[0].tag003A0210[0].value = CALM_CHANNEL_SENSIT

      // waveform data length
      template.tag54000100[0].item[0].tag54001010[0].@len = mv_values.size() * 2

      // waveform data
      template.tag54000100[0].item[0].tag54001010[0].value = encoded_values_builder.toString()
      */

      // Modifications for attr tag template
      def waveformSequence = template.attr.find{ it.@tag == '54000100' }

      // waveform samples
      waveformSequence.item[0].attr.find{ it.@tag == '003A0010' }.value = mv_values.size()

      // sampling frequency
      waveformSequence.item[0].attr.find{ it.@tag == '003A001A' }.value = 200

      // channel sensitivity
      waveformSequence.item[0].attr.find{ it.@tag == '003A0200' }.item[0].attr.find{ it.@tag == '003A0210' }.value = CALM_CHANNEL_SENSIT

      // waveform data length
      waveformSequence.item[0].attr.find{ it.@tag == '54001010' }.@len = mv_values.size() * 2

      // waveform data
      waveformSequence.item[0].attr.find{ it.@tag == '54001010' }.value = encoded_values_builder.toString()


      def out = new File(args[1])
      def printer = new XmlNodePrinter(new PrintWriter(new FileWriter(out)))
      printer.setPreserveWhitespace(true)
      printer.print(template)
   }

   static short mVolt2RawChSensit(float mvolt_value, float ch_sensit)
   {
      float r = mvolt_value * 1000 / ch_sensit
      return (short) Math.round(r)
   }

   static byte[] short2ByteArray(short n)
   {
     byte[] ret = new byte[2]
     ret[0] = (byte)(n & 0xff)
     ret[1] = (byte)((n >> 8) & 0xff)
     return ret
   }

   static short byteArray2sShort(byte[] b)
   {
     return (b[1] << 8) | (b[0] & 0xff)
   }

   // unsigned short needs more than 16 bits
   static int byteArray2uShort(byte[] b)
   {
     return (byteArray2sShort(b) & 0xffff)
   }
}
