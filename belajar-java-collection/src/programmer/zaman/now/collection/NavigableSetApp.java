package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Adnan", "Erlansyah", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> erlansyah = names.headSet("Erlansyah", true); // Mendapatkan data array ke depan
        NavigableSet<String> erlansyah2 = names.tailSet("Erlansyah", true);// Mendapatkan data array ke belakang

        for (var name: names) {
            System.out.println(name);
        }

        for (var name: namesReverse) {
            System.out.println(name);
        }

        for (var name: erlansyah) {
            System.out.println(name);
        }

        for (var name: erlansyah2) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Ups");

    }
}
