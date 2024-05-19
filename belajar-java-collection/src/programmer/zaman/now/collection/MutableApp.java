package programmer.zaman.now.collection;

import programmer.zaman.now.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Adnan");

        person.addHoby("Game");
        person.addHoby("Coding");

        doSomethingWithHobbies(person.getHobybies());

        for (var hobby : person.getHobybies()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }
}
