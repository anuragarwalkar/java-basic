package src.com.demo.basic;

abstract class Human {
    public abstract void eat();

    public abstract void walk();
}

class Man extends Human {
    public void eat() {

    }

    public void walk() {

    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Human obj = new Human(); We cant Intantiate obj
    }
}
