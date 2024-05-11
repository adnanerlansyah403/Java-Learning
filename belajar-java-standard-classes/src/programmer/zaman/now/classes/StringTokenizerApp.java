package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/util/StringTokenizer.html
        String value = "Adnan Erlansyah";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

    }
}
