package programmer.zaman.now.collection;

import programmer.zaman.now.data.Person;
import programmer.zaman.now.data.PersonComperator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComperator().reversed());

        people.add(new Person("Adnan"));
        people.add(new Person("Budi"));
        people.add(new Person("Joko"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new Person("Adnan"));

    }
}
