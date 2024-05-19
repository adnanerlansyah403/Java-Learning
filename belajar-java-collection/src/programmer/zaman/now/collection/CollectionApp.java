package programmer.zaman.now.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Adnan");
        collection.add("Erlansyah");
        collection.add("Bayu");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        collection.remove("Adnan");
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Erlansyah"));;
        System.out.println(collection.containsAll(List.of("Programmer")));;
    }
}
