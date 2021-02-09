package src.com.demo.basic;

class Casio {
    public int add(int i, int j) {
        return (i + j);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Casio obj = new Casio();

        System.out.println(obj.add(1, 2));
    }
}
