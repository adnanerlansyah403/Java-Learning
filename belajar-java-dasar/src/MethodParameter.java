public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Adnan", "Erlansyah");
        sayHello("Ilyas", "Aditya");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
