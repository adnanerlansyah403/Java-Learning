package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Properties.html

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }

        try {

            Properties properties2 = new Properties();
            properties2.put("name.first", "Adnan");
            properties2.put("name.last", "Erlansyah");

            properties2.store(new FileOutputStream("name.properties"), "");

        } catch (FileNotFoundException exception) {
            System.out.println("Gagal membuat properties");
        } catch (IOException exception) {
            System.out.println("Gagal menyimpan properties");
        }

    }

}
