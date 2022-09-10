

public class SystemClass {
    /*
    di bawah ini adalah contoh penggunaan system class
     */
    public static void main(String[] args) {
        /*
        untuk mendapatkan enveroment var
         */
        System.out.println(System.getenv());
        /*
        mendapatkan milisecond yang sekarang
         */
        System.out.println(System.currentTimeMillis());
        /*
        mendapatkan nanosecond yang sekarang
         */
        System.out.println(System.nanoTime());
        /*
        untuk memberitahu sesuatu jika sudah kelar(Status program)
         */
        System.exit(1);
    }

}
