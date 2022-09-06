import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        /*
        * StringTokenizer digunakan untuk memotong string  menjadi token atau string yang lebih sederhana
        * Method hasMoreTokens() akan mengembalikan nilai True(boolean)
        * untuk param delimiteer ini harus sesuai dengan apa yang ada di string agar string bisa menjadi tokens2 terpisah
         */
        String fullName ="fajar abdillah ahamad";
        StringTokenizer tokenizer = new StringTokenizer(fullName," ");
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
