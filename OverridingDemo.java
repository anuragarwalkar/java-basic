class A {
    public void show() {
        System.out.println("In A");
    }
}

class B extends A{

    @Override
    public void show() {
        System.out.println("In B");
    }

    public void config() {
        System.out.println("In Config");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
    }   
}
