package programmer.zaman.now.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/util/UUID.html

        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);
        }

    }
}
