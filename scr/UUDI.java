import java.util.UUID;

public class UUDI {
    public static void main(String[] args) {

        for (int i = 0;i<20;i++){
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
