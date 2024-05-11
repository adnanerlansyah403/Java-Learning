package programmer.zaman.now.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int value = random.nextInt(100);
            System.out.println(value);
        }
    }
}
