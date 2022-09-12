import java.io.*;
import java.util.Properties;

public class PropertiesAplication {
    public static void main(String[] args) {
        /*
        dibawah ini adalah cara mengakses field yang ada pada ClassProperties
         */
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

        /*
        dibawah ini adalah cara membuat PropertiesClass yang baru
         */
        try{
            Properties properties = new Properties();
            properties.put("database.name","KlinikCeria");
            properties.put("database.port","1493");
            properties.put("database.email","fajardillah25@gmail.com");
            properties.store(new FileOutputStream("DATABASE.properties"),"");
        }catch (FileNotFoundException exception){
            System.out.println("error membuat file properties baru");
        }catch (IOException exception){
            System.out.println("error menyimpan file properties baru");
        }

    }
}
