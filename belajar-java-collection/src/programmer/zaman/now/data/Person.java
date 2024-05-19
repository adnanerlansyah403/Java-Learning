package programmer.zaman.now.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHoby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobybies() {
//        return hobbies;
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }

}
