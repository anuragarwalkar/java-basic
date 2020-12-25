package src;

// Type of interface
// Single abstract method - Functional Interface - Lambda Expression - scala
// Marker interface (Dont have any method serializable)

@FunctionalInterface // only one abstract method/*  */
interface Abc {
    default void show() {
        System.out.println("In show");
    }
    void abc();
}

public class InterfaceDemo {
    
    public static void main(String[] args) {
        Abc obj = () -> {
            System.out.println("I'm best");
        };

        obj.show();
    }
}
