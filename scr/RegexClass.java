import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    /*
    ini adalah regular Expresion untuk mesin pencarian yang lebih advance,yang mempunyai 2 class di dalamnya yaitu Pattern(representasi hasil kompilasi) dan Matcher(untuk pencarian dari Pattern yang sudah kita buat)
     */
    public static void main(String[] args) {
        String name ="fajar abdillah ahmad";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[l][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()){
            var result = matcher.group();
            System.out.println(result);
        }

    }
}
