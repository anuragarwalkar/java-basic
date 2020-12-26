package src;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection values = new ArrayList();  // Add any values
        // values.add(2);
        // values.add("anruag");

        // Collection<Integer> values = new ArrayList<Integer>(); // Generics Before 1.7
        Collection<Integer> values = new ArrayList<>(); // Generics 1.7

        values.add(2);

        System.out.println(values);

    }
}
