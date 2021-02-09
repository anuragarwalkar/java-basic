package src.com.demo.basic;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is you age: ");
        byte age = scanner.nextByte();

        Scanner newScanner = new Scanner(System.in);
        System.out.print("What is you name: ");
        String name = newScanner.nextLine();

        System.out.println("ohh " + name + " you have remaining " + (100 - age) + " years of your life !!!");
    }
}
