package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// C => List => ArrayList

// IMP Collection does not work with index

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection values = new ArrayList();  // Add any values
        // values.add(2);
        // values.add("anruag");

        Collection values = new ArrayList<>();

        values.add(5);
        values.add(6);
        values.add(7);

        Iterator it = values.iterator();


        // Collection<Integer> values = new ArrayList<Integer>(); // Generics Before 1.7
        // Collection<Integer> values = new ArrayList<>(); // Generics 1.7
        // List<Integer> values = new ArrayList<>(); // Generics 1.7

        // Set<Integer> values = new HashSet<>(); // Uniq values but while fetching data get random order
        // Set<Integer> values = new TreeSet<>(); // Uniq values but while fetching data get sorted order

        // Map<Integer, String> m = new HashMap();
        // Map<Integer, String> m = new Hashtable<>(); Thread safe sync


        // values.add(2);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
