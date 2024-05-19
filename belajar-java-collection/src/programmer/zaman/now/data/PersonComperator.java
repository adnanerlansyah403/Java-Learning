package programmer.zaman.now.data;

import java.util.Comparator;

public class PersonComperator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
