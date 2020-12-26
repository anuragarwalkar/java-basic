package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// C => List => ArrayList

// IMP Collection does not work with index

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection values = new ArrayList();  // Add any values
        // values.add(2);
        // values.add("anruag");

        // Collection<Integer> values = new ArrayList<Integer>(); // Generics Before 1.7
        // Collection<Integer> values = new ArrayList<>(); // Generics 1.7
        List<Integer> values = new ArrayList<>(); // Generics 1.7

        // Set<Integer> values = new HashSet<>(); // Uniq values

        values.add(2);

        System.out.println(values.get(0));

    }
}
