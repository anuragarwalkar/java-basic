package src.com.demo.basic;

class CustomCalc {
    public int add(int... i) {
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            sum += i[j];
        }

        return sum;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        CustomCalc dell = new CustomCalc();

        System.out.println(dell.add(1, 2, 3));
    }
}
