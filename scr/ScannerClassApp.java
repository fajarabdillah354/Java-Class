import java.util.Scanner;

public class ScannerClassApp {
    /*
    * Class Scanner digunakan untuk membaca data di console maupun terminal,termasuk membaca input user
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name : ");
        /*
        * nextLine() digunakan untuk mengambil data String
        * nextINT digunakan untuk membaca data integer
        * nextLong digunakan untuk membaca data Long
        * nextBoolean digunakan untuk membaca data boolean
         */
        String inputName = input.nextLine();
        System.out.println("nama anda adalah "+inputName);
    }
}
