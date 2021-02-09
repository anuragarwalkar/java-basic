package src.com.demo.basic.referance;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // Initalise the array
        int[] numbers = new int[5];

        // Add numbers
        numbers[0] = 1;

        // Initalise the array if we know the values AOT
        int[] numbersNew = { 1, 2 };

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbersNew));
    }
}
