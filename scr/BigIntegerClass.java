import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("3545386816175543");
        BigInteger b = new BigInteger("3114812520505035");
        /*
        * .add() digunakan untuk menambah 2 nilai dalam bentuk integer yang besar(operator penjumlahan)
         */
        BigInteger result = a.add(b);
        System.out.println(result);

        /*
        * .subract() adalah operator untuk pengurangan
         */
        BigInteger result2 = a.subtract(b);
        System.out.println(result2);

        /*
        .multiply() adalah operator untuk perkalian
         */
        BigInteger result3 = a.multiply(b);
        System.out.println(result3);

        /*
        .divide() adalah operator untuk pembagian
         */
        BigInteger result4 = a.divide(b);
        System.out.println(result4);
    }




}
