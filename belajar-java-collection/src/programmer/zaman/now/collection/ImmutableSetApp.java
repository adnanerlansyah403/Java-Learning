package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Adnan");

        Set<String> mutable = new HashSet<>();
        mutable.add("Adnan");
        mutable.add("Erlansyah");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Adnan", "Erlansyah");

//        set.add("Adnan"); // Error
//        set.remove("Adnan"); // Error

    }
}
