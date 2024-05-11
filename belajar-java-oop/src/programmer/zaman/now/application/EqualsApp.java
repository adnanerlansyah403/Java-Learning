package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Adnan";
        first = first + " " + "Erlansyah";

        System.out.println(first);

        String second = "Adnan Erlansyah";

        System.out.println(first == second); // False
        System.out.println(first.equals(second)); // True

        String third = "Adnan Erlansyah";

        System.out.println(second == third);

    }
}
