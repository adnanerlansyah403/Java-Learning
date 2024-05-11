package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
//        String name = "Adnan";
//
//        name = name + " " + "Erlansyah";
//
//        name = name + " " + "Aji";

        StringBuilder builder = new StringBuilder();
        builder.append("Adnan");
        builder.append(" ");
        builder.append("Erlansyah");

//        System.out.println(name);

        String name = builder.toString();
        System.out.println(name);
    }
}
