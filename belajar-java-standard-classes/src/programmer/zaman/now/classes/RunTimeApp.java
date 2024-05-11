package programmer.zaman.now.classes;

public class RunTimeApp {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/lang/Runtime.html
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());

    }
}
