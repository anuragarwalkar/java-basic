package src;

// Type of interface
// Single abstract method - Functional Interface - Lambda Expression - scala
// Marker interface

@FunctionalInterface
interface Abc {
    void show();
}

public class InterfaceDemo {
    
    public static void main(String[] args) {
        Abc obj = () -> {
            System.out.println("I'm best");
        };

        obj.show();
    }
}
