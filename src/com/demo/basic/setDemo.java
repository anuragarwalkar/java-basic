package src.com.demo.basic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {
    public static void main(String[] args) {
        // Set<Integer> values = new HashSet<>(); // Sequence is not maintained
        Set<Integer> values = new TreeSet<>(); // Sequence is maintained

        values.add(5);
        values.add(6);
        values.add(8);
        values.add(0);
        values.add(89);

        for (int i : values) {
            System.out.println(i);
        }
    }
}
