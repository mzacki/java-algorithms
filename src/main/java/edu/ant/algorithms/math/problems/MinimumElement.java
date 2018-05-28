package edu.ant.algorithms.math.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Matt on 01.01.2019 at 18:57.
 */

public class MinimumElement {

    public static void main(String[] args) {
        // readIntegers(3);
        System.out.println(findMin(readIntegers(3)));
    }


    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int[] readIntegers(int count) {

        System.out.println("You need to enter " + count + " integers...");
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = SCANNER.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}
