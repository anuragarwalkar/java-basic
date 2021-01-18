package src.com.demo.oops;

public class Dog extends Animal {
    String color;
    String name;
    String breed;

    public void wagTail() {
        System.out.println("dog wag their tails");
    }

    public void barking() {
        System.out.println("Dog barks");
    }

    public void eating() {
        System.out.println("Dog eats");
    }
}
