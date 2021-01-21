package edu.ant.algorithms.math.problems;

import java.util.Scanner;

/**
 * Created by Matt on 29.12.2018 at 13:28.
 */

public class SortArray {

    public static void main(String[] args) {
        //System.out.println(getIntegers(5));
        int[] newArray = getIntegers(5);
        printArray(newArray);
        printArray(sortArray(newArray));
    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Integer #" + (i+1) + ": " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integers...\r");
        int[] array = new int[number];

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Enter integer #" + (i + 1));
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

}
