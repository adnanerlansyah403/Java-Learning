package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Adnan");
//        customer.setLevel(String.valueOf(Level.PREMIUM));
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelString = Level.STANDARD.name();
        System.out.println(levelString);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("===Print Levels===");
//        Level[] levels = Level.values();
        for (var value : Level.values()) {
            System.out.println(value);
        }



    }
}
