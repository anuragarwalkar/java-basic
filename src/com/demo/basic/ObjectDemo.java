package src.com.demo.basic;

class Calc {
    int num1;
    int num2;
    int num3;
    int result;

    public Calc() {
        num1 = 1;

        System.out.println("Plain Anurag");
    }

    public Calc(int n) {
        this.num1 = n;
    }

    public Calc(double d, int n) {
        num1 = (int) d;
        num2 = n;
        System.out.println("Anurag Arwalkar");
    }

    public void perform() {
        result = num1 + num2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Calc obj = new Calc();

        System.out.println(obj.num1);
    }
}
