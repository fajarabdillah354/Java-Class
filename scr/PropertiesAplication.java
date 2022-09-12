import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesAplication {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            System.out.println(properties.getProperty("nama.full"));
            System.out.println(properties.getProperty("nama.age"));
            System.out.println(properties.getProperty("nama.hoby"));

        }catch(FileNotFoundException exception){
            System.out.println("file tidak ditemukan");
        }catch (IOException exception){
            System.out.println("gagal load data properties");
        }

    }
}
