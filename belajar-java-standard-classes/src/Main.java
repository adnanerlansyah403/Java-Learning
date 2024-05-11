import java.util.StringJoiner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/StringJoiner.html
        String[] names = {"Adnan", "Erlansyah"};
        StringJoiner joiner = new StringJoiner(
                ",", "[", "]"
        );

        joiner.add("Adnan");
        joiner.add("Erlansyah");

        String value = joiner.toString();
        System.out.println(value);

    }
}