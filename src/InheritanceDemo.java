package src;

class Calculator {
    public int add(int i, int j) {
        return (i + j);
    }
}

class CalcAdv extends Calculator {
    public int substract(int i, int j) {
        return (i - j);
    }
}

public class InheritanceDemo {
   public static void main(String args[]) {
        CalcAdv calc = new CalcAdv();
        int result = calc.add(2, 3);
        int subtractRsult = calc.substract(2, 3);

        System.out.println(subtractRsult);
   } 
}
