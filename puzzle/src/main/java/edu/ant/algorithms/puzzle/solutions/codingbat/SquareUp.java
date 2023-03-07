package edu.ant.algorithms.puzzle.solutions.codingbat;

import java.util.Arrays;

public class SquareUp {

    /**
     * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1, 3,
     * 2, 1} (spaces added to show the 3 groups).
     *
     * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1] squareUp(2) → [0, 1, 2, 1] squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3,
     * 2, 1, 4, 3, 2, 1]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
    }

    public static int[] squareUp(int n) {

        int[] array = new int[n * n];

        int startIndex = array.length - 1;
        int v = 1;
        int jump = n;
        while (n > 0) {

            int index = startIndex - v + 1;
            int placed = 0;
            while (placed < n) {
                array[index] = v;
                index -= jump;
                placed++;
                System.out.println(Arrays.toString(array));
            }
            System.out.println("After iteration " + Arrays.toString(array));
            v++;
            n--;
        }
        return array;
    }

}
