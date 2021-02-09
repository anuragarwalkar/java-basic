package src.com.demo.basic.referance;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // Initalise the array
        int[] numbers = new int[5];

        // Add numbers
        numbers[0] = 1;

        int[][] twoDimentionalArray = new int[2][3];
        int[][] twoDimentionalArrayNew = { { 1, 2 }, { 1, 2, 3 } };

        twoDimentionalArray[0][0] = 1;

        System.out.println(Arrays.deepToString(twoDimentionalArray));

        int[][][] threeDimentionalArray = new int[2][3][4];

        threeDimentionalArray[0][0][0] = 2;

        System.out.println(Arrays.deepToString(threeDimentionalArray));

        // Initalise the array if we know the values AOT
        int[] numbersNew = { 1, 2, 5, 4, 9, 7, 8 };

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(numbersNew));

        System.out.println(numbersNew.length);

        Arrays.sort(numbersNew);

        System.out.println(Arrays.toString(numbersNew));
    }
}
