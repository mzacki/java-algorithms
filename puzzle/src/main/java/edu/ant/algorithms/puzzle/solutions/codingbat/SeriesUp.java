package edu.ant.algorithms.puzzle.solutions.codingbat;

import java.util.Arrays;

/**
 *
 Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
 (spaces added to show the grouping).
 Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

 seriesUp(3) → [1, 1, 2, 1, 2, 3]
 seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 seriesUp(2) → [1, 1, 2]
 * */

public class SeriesUp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }


    public static int[] seriesUp(int n) {

        int length = n*(n + 1) / 2;
        int[] array = new int[length];
        int count = 1;
        int index = 0;
        while (count <= n) {

            int val = 1;
            while (val <= count) {
                array[index] = val;
                val++;
                index++;
            }

            count++;
        }
        return array;
    }

}
