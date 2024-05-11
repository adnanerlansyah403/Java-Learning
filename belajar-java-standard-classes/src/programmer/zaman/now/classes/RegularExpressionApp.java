package programmer.zaman.now.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionApp {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
        String name = "Adnan Erlansyah";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-z]*"); // untuk mencari pattern yg di tengah2 dari katanya terdapat huruf "a"

        Matcher matcher = pattern.matcher(name);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
