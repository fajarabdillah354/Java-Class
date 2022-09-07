public class StringClass {

        /*
        berikut adalah termasuk contoh method class String
         */
        public static void main(String[] args) {
            String name = "fajar AbdillAH ahmAd";

    /*
    membuat STRING menjadi huruf kecil semua dengan tOLowerCase()
     */
            String lowName = name.toLowerCase();
            System.out.println(lowName);


    /*
    Membuat STRING menjadi huruf besar semua dengan menggunakan toUpperCase()
     */
            String upperName = name.toUpperCase();
            System.out.println(upperName);

    /*
    mengukur panjang String menggunakan LENGTH()
     */
            int getPanjang = name.length();
            System.out.println(getPanjang);

    /*
    memecah String dengan menggunakan Array String dengan function split()
     */
            String[] split = name.split(" ");
            for (var value : split) {
                System.out.println(value.toUpperCase());
            }

    /*
    melihat apakah apakah ada String kosong
    */
            String test = "";
            boolean getKosong = test.isBlank();
            System.out.println(getKosong);//akan menghasilkan nilai true karna var test memang kosong tidak mempunyai value


    /*
    melihat apakah String sudah terisi dengan menggunakan isEmpty()
     */
            String cek = "turu";
            System.out.println(cek.isEmpty());


    /*
    mengambil karakter String dengan chartAt(value)
     */
            String bola = "kurotul koddam";
            var lapangan = bola.charAt(3);//param ini berisi nilai index yang ingin di ambil
            System.out.println(lapangan);


        }
    }

