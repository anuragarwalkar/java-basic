package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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

        // Collection values = new ArrayList<>();

        List values = new ArrayList(); //Mutable

        values.add(9);
        values.add(5);
        values.add(6);
        values.add(7);

        Comparator<Integer> c = new Comparator<Integer>(){
            public int compare(Integer i, Integer j) {
               if (i % 10 > j% 10) {
                   return 1;
               } else {
                   return -1;
               }
            }
        };

        Collections.sort(values, c);

        Collections.reverse(values);

        System.out.println(Collections.min(values));

        // for(int i = 0; i < values.size(); i++) {
        //     System.out.println(values.get(i));
        // }

        // Iterator it = values.iterator();

        for(Object o: values) {
            System.out.println(o);
        }


        // Collection<Integer> values = new ArrayList<Integer>(); // Generics Before 1.7
        // Collection<Integer> values = new ArrayList<>(); // Generics 1.7
        // List<Integer> values = new ArrayList<>(); // Generics 1.7

        // Set<Integer> values = new HashSet<>(); // Uniq values but while fetching data get random order
        // Set<Integer> values = new TreeSet<>(); // Uniq values but while fetching data get sorted order

        // Map<Integer, String> m = new HashMap();
        // Map<Integer, String> m = new Hashtable<>(); Thread safe sync


        // values.add(2);

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

    }
}
