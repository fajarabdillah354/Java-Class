
public class NumberClass {
    public static void main(String[] args) {
        /*
        di bawah ini adalah contoh konversi tipe data number yang non primitif
         */
        Integer x = 100;
        Long toLong = x.longValue();
        Byte toByte = toLong.byteValue();
        Short toShort = toByte.shortValue();
        System.out.println(toShort);

        /*
        di bawah ini adalah contoh konversi dari string ke integer(yang mempunyai balikan tipe data primitif
         */
        String exString = "354";
        Integer getString = Integer.parseInt(exString);
        System.out.println(getString);

        /*
        di bawah ini akan menyebabkan error NumberformatException karna value yang akan di ubah ke Long mempunyai character selain int
         */
        String exLong = "562v";
        Long setLong = Long.valueOf(exLong);
        System.out.println(setLong);

    }
}
