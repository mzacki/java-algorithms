package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 23.12.2018 at 20:55.
 */

public class IntEqualityPrinter {

    public static void printEqual(int x, int y, int z) {

        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && x != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal nor different");
        }
    }

}
