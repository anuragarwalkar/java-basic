package src.com.demo.basic;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 5; // Primitive datatype

        Integer ii = new Integer(i);

        int j = ii.intValue();
    }
}
