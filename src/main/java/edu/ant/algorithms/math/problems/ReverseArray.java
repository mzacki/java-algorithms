package com.beehive.algorithms.numbers;

import java.util.Arrays;

/**
 * Created by Matt on 01.01.2019 at 19:50.
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {

        for (int i = 0; i < array.length / 2 ; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}
