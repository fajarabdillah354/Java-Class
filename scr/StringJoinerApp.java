import java.util.StringJoiner;
public class StringJoinerApp {
    public static void main(String[] args) {
        /*
        * dengan StringJoiner kita bisa memanipulasi String termasuk  menggabungkan String dengan String secara paralel
        * kita juga dapat memanipulasi prefix(karakter di awal) dan suffixnya(karakter di akhir) serta delimiter(pemisah String)
        kita
         */
        StringJoiner joiner = new StringJoiner(" @ ",
                " [ "," ] ");
        joiner.add("fajar");
        joiner.add("abdillah");
        joiner.add("ahmad");

        String value = joiner.toString();
        System.out.println(value);
    }
}
