package programmer.zaman.now.classes;

public class SystemApp {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv());

        System.gc();

        System.exit(1);

        System.out.println("Hi");

    }

}
