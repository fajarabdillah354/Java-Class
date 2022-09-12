import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        for (var i = 0;i<50;i++){
            var value = random.nextInt(500);//ini akan memberi angka ramdom dengan batas angka 500(angka random tidak akan lebih dari angka 500)
            System.out.println(value);
        }
    }
}
