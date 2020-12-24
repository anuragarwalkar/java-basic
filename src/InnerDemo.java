package src;
class Outer {
    int a;

    public void show() {
        System.out.println("Show you talent");
    }

    static class Inner {
        public void display() {
            System.out.println("In display");
        }
    }
}

public class InnerDemo {

    public static void main(String[] args) {
        Outer obj = new Outer();

        Outer.Inner obj1 = new Outer.Inner();
        
        obj1.display();
    }  
}
