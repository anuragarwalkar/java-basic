package src;

import java.util.ArrayList;
import java.util.List;

class Stud {
    int rollNumber;
    int marks;
    String name;


    public Stud(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Stud [marks=" + marks + ", name=" + name + ", rollNumber=" + rollNumber + "]";
    }

    
}


public class ComparableDemo {
    
    public static void main(String[] args) {

        List<Stud> studs = new ArrayList();

        studs.add(new Stud(1, "Anurag", 100));
        studs.add(new Stud(2, "Vaishali", 60));


       for(Stud s: studs) {
           System.out.println(s);
       }
        
    }

}
