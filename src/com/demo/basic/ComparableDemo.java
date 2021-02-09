package src.com.demo.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud> {
    int rollNumber;
    int marks;
    String name;

    public Stud(int rollNumber, String name, int marks) {
        super();
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Stud [marks=" + marks + ", name=" + name + ", rollNumber=" + rollNumber + "]";
    }

    public int compareTo(Stud s) {
        return rollNumber > s.rollNumber ? -1 : 1;
    }

}

public class ComparableDemo {

    public static void main(String[] args) {

        List<Stud> studs = new ArrayList();

        studs.add(new Stud(1, "Anurag", 100));
        studs.add(new Stud(2, "Vaishali", 60));

        Collections.sort(studs);

        for (Stud s : studs) {
            System.out.println(s);
        }

    }

}
