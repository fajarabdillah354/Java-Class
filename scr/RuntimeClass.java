
public class RuntimeClass {
    /*
    Class ini tidak mempunyai kata kunci new karna tidak mempunyai parent Class pada java lang
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        /*
        untuk mengetahui core laptop kita
         */
        System.out.println(runtime.availableProcessors());
        /*
        untuk mengetahui memory bebas pada JVM
         */
        System.out.println(runtime.freeMemory());
        /*
        mendapatkan jumlah memory maximum pada JVM
         */
        System.out.println(runtime.maxMemory());
        /*
        mendapatkan total memory pada JVM
         */
        System.out.println(runtime.totalMemory());
        /*
        untuk membuang berkas-berkas yang sudah dipakai
         */
        runtime.gc();

    }
}
