package programmer.zaman.now.application;

import programmer.zaman.now.data.Product; // Import specific package
import programmer.zaman.now.data.*; // Import all packages
// Default import java.lang seperti String, Integer, Boolean, dll

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Book 2", 50000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();

    }
}
