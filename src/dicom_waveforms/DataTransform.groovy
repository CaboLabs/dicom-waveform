/**
 *
 */
package dicom_waveforms

/**
 * @author pab
 *
 * run: groovy -cp "./lib/*" src/dicom_waveforms/DataTransform.groovy
 *
 * To encode data in DICOM XML, as 16 bit unsigned:
 *
 * xml_encoded_value = byteArray2uShort(short2ByteArray(raw_value))
 *
 * And to get the raw_value from a mV value (10^-3), with ChannelSensitivity = 2.5 uV (10^-6)
 *
 * mvolt_value = volt_value * 10^-3
 * raw_value = volt_value * 10^-3 / (2.5 * 10^-6) = mvolt_value * 1000 / 2.5
 *
 * e.g. raw_value = 0.3475 * 1000 / 2.5 = 139
 *
 */
class DataTransform {

   static float DCM_CHANNEL_SENSIT = 2.5
   static float CALM_CHANNEL_SENSIT = 0.732421875

   static main(args)
   {
      // Data from DICOM file with channel sensitivity 2.5 uV
      def raw_dicom_data = '65534,65527,65529,65534,65531,3,7,23,35,0,65528,65530,65487,65534,127,7,65530,65535,65528,65532,65533,8,65533,65535,65525,65528,65519,65523,65524,65521,65523,65524,65524,65524,65528,65533,65520,65522,11,4,4,3,65528,65507,65521,65442,65534,56,65501,65497,65483,65508,65481,65480,65511,65519,65480,65478,65500,65480,65492,65480,65519,65493,65511,65529,65522,65517,65521,65522,65532,65528,3,13,34,29,18,0,65527,65478,73,77,19,13,45,33,19,29,22,27,11,15,15,6,24,7,17,15,26,11,13,15,12,27,25,9,25,17,29,44,53,22,24,9,65506,51,113,23,29,19,24,18,17,28,18,14,19,10,5,7,9,19,14,65531,5,4,8,6,65535,14,25,2,14,12,7,24,65531,65526,65510,65460,65453,65425,57,65500,65480,65474,65481,65484,65492,65494,65498,65507,65513,65513,65513,65508,65510,65518,65522,65531,65531,65525,65519,65526,65520,65527,65526,65525,65525,65529,65534,9,24,25,65524,65526,65522,65462,50,75,65531,65526,65527,65531,65535,65535,6,4,65533,65530,65527,65522,65529,65522,65529,65528,65526,0,65525,65533,65527,65529,65530,65524,65530,65531,12,20,28,65535,65529,65525,65472,41,75,3,65534,65531,65535,65528,65534,8,11,4,0,65524,65524,65529,65529,65531,65527,65532,65529,65531,65534,65535,65535,0,3,65534,1,6,8,26,34,34,2,4,65535,65474,59,66,3,2,2,1,3,8,10,10,9,2,65534,65529,65534,65533,0,3,65532,7,65535,1,0,1,0,1,1,4,1,22,35,27,65532,65531,65520,65469,83,34,2,65533,65532,65535,4,6,5,7,0,4,65528,65526,65530,65531,65533,65533,65531,65531,65525,65530,65529,65529,65531,65528,0,65530,14,22,14,65526,65520,65510,65469,92,11,65532,65527,65528,65530,65533,65528,65532,65530,65527,65529,65522,65516,65524,65525,65523,65533,65534,65529,65525,65527,65524,65532,65531,65535,0,14,30,19,65535,65527,65525,65470,74,47,6,65534,65528,3,2,1,6,0,4,4,65526,65524,65528,65527,65527,65529,65534,65534,65531,65528,1,65530,2,5,24,37,3,65526,65528,65494,65518,132,10,65532,65533,65523,65533,65533,4,65533,65533,65526,65526,65521,65523,65522,65523,65523,65518,65525'

      def raw_dicom_data_list = raw_dicom_data.split(',').collect{ Integer.parseInt( it ) }

      //println raw_dicom_data_list.size()

      /*
      raw_dicom_data_list.each {

      }
      */


      // Encode raw for XML, raw es el de DICOM ya tiene negativos, no el del sensor que aparte se lo ajusta con -2048.
      /*
      short raw_value = -2
      int xml_encoded_value = byteArray2uShort(short2ByteArray(raw_value))
      println xml_encoded_value
      */



      def f = new File('resources/temp_1540393629742')
      def t = f.text
      def lines = t.split("\n")
      //def raw_values = lines.collect{ mVolt2Raw( Float.parseFloat( it.split(",")[1] ) ) }
      //println raw_values


      /**
       * Considerar:
       * 1. raw del sensor tiene rango 0..4095, que se ajusta a los valores negativos con la traslacion raw -2048
       * 2. raw del DICOM ya esta trasladado y tiene los negativos codificados por lo que no se deberia aplicar el -2048
       * 3. Para calcular el channel sensitivity en uV del sensor CALM use las formulas:
       *      raw = mv * 1000 / ch_sensit (ecuacion DICOM)
       *      raw = mv * 4096 / 3         (ecuacion del sensor, sonciderando que raw ya tiene el ajuste de -2048)
       *      => ch_sensit = 0.732421875 uV
       *
       */

      println 'DCMraw ch sensit: '+ mVolt2RawChSensit(0.3475, DCM_CHANNEL_SENSIT)
      println 'DCMraw ch sensit: '+ mVolt2RawChSensit(0.0, DCM_CHANNEL_SENSIT)
      println 'DCMraw ch sensit: '+ mVolt2RawChSensit(-0.0075, DCM_CHANNEL_SENSIT)

      println ""
      println "Sensor data conversions"

      def mv_values = lines.collect{ Float.parseFloat( it.split(",")[1] ) }
      println 'units\tsource \t\t2raw \t2raw2mV'

      short raw_value
      int xml_encoded_value

      for (int i=0; i<10; i++)
      {
         println 'mV: \t'+ mv_values[i] +'\t'+ mV2rawCALM(mv_values[i]) +'\t'+ raw2mVCALM(mV2rawCALM(mv_values[i]))

         // Ya tiene la correccion del -2048, este el el valor que se deberia codificar en DICOM!
         println 'raw ch sensit: '+ mVolt2RawChSensit(mv_values[i], CALM_CHANNEL_SENSIT)

         raw_value = mVolt2RawChSensit(mv_values[i], CALM_CHANNEL_SENSIT)
         xml_encoded_value = byteArray2uShort(short2ByteArray(raw_value))
         println xml_encoded_value
      }

      println ""

      println "min: \t"+ mv_values.min() +'\t'+ mV2rawCALM(mv_values.min())
      println "max: \t"+ mv_values.max() +'\t'+ mV2rawCALM(mv_values.max())

      // CALM sensor range: -1.5 .. 1.49 mv ~ 0..4095 raw (2^12)
      println "raw min: "+ mV2rawCALM(-1.5) // 0
      println "raw max: "+ mV2rawCALM(1.4992676) // 4095

      // To get the DICOM raw, get those^ values - 2048

      println "mV min: "+ raw2mVCALM((short)0) // -1.5
      println "mV max: "+ raw2mVCALM((short)4095) // 1.4992676
   }

   /**
    * Transforms CALM data from raw to mV
    */
   static float raw2mVCALM(short raw)
   {
      return (raw - 2048)*(3.0/4096.0)
   }

   /**
    * Transforms CALM data from raw to mV
    */
   static short mV2rawCALM(float mv)
   {
      return (short) Math.round((mv * 4096.0 / 3.0) + 2048)
   }

   /**
    * Transforms data in Example.dcm from mV to raw (has Channel Sensitivity 2.5 uV)
    */
   static short mVolt2RawChSensit(float mvolt_value, float ch_sensit)
   {
      float r = mvolt_value * 1000 / ch_sensit
      return (short) Math.round(r)
   }

   static float raw2mVoltChSensit(int raw, float ch_sensit)
   {
      raw * ch_sensit / 1000
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
