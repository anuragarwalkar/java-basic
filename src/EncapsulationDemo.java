package src;
// Encapsulation => Binding data with methods
class Student {
    private int rollno;
    String name;

    public void setRollNumber(int i) {
        this.rollno = i;
    }

    public int getRollNumber() {
        return this.rollno;
    }


}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollNumber(1);

        System.out.println(s1.getRollNumber());
    }
}
