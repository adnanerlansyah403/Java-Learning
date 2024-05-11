package programmer.zaman.now.classes;

public class StringApp {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        String name = "Adnan Erlansyah";
        String namaLowerCase = name.toLowerCase();
        String namaUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(namaLowerCase);
        System.out.println(namaUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Adnan"));
        System.out.println(name.endsWith("Erlansyah"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

    }

}
