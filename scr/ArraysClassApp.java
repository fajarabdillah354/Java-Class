import java.util.Arrays;

public class ArraysClassApp {
    public static void main(String[] args) {

        int[] numbers = {
                3,5,1,65,3113,23,74,41,907,42
        };

        int[] numbers2 = {
                3,5,1,65,3113,23,74,41,901,42
        };
        /*
        dibawah ini adalah perintah untuk mengurutkan array
         */
        Arrays.sort(numbers);
        /*
        di bawah ini adalah untuk merepresentasikan dalam bentuk String
         */
        System.out.println("dibawah ini adalah hasil pengurutan untuk array pertama");
        System.out.println(Arrays.toString(numbers));
        /*
        dibawah ini pencarian data dengan binary seacrh(ini akan mengembalikan index dari value yang di cari setelah data di sory)
         */
        System.out.println(Arrays.binarySearch(numbers,41));
        /*
        dibawah ini untuk mencopy arrays(dari index 0 sampe 5)
         */
        int[] result = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(result));

        /*
        dibawah ini untuk mencopy dengan menggunakan range
         */
        int[] result2 = Arrays.copyOfRange(numbers,3,7);
        System.out.println(Arrays.toString(result2));

        //mengurutkan numbers2
        System.out.println("dibawah ini adalah hasil pengurutan untuk array kedua");
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        /*
        dibawah ini untuk membandingkan 2 array dengan Equals(akan mengembalikan nilai boolean
         */
        System.out.println("hasil perbandingan nilai array pertama dan kedua : "+Arrays.equals(numbers,numbers2)+" karna isi arraynya berbeda");

    }

}
