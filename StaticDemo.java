class Emp {
    int eid;
    int salary;
    static String ceo;

    static {
        ceo = "Anurag";
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;

        Emp rahul = new Emp();
        rahul.eid = 9;
        rahul.salary = 5000;

        rahul.show();
        navin.show();
    }
}
