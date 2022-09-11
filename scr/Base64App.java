import java.util.Base64;
public class Base64App {
    public static void main(String[] args) {
        /*
        kode di bawa ini untuk merubah ke bentuk encode
         */
        String myName = "fajar abdillah ahmad";
        String encode = Base64.getEncoder().encodeToString(myName.getBytes());
        System.out.println(encode);

        /*
        function di bawah ini untuk membalikkan dari encode ke String semula
         */
        byte[] bytes = Base64.getDecoder().decode(encode);
        String result = new String(bytes);
        System.out.println(result);

    }
}
