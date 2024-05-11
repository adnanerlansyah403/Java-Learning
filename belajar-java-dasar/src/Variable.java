public class Variable {
    public static void main(String[] args) {
        // var name; // error
        String name;
        name = "Adnan Erlansyah";

        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Apo";
        System.out.println(name);

        var firstName = "Adnan";
        var lastName = "Erlansyah";

        final String application = "Belajar Java";

        // application = "Belajar Lain"; // error
    }
}
