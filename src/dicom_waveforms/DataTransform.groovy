/**
 *
 */
package dicom_waveforms

/**
 * @author pab
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

   static main(args)
   {
      def f = new File('resources/temp_1540393629742')
      def t = f.text
      def lines = t.split("\n")
      def raw_values = lines.collect{ mVolt2Raw( Float.parseFloat( it.split(",")[1] ) ) }
      println raw_values
   }

   static short mVolt2Raw(float mvolt_value)
   {
      float r = mvolt_value * 1000 / 2.5
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
