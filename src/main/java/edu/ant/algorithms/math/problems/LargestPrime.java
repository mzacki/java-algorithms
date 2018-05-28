package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 15:22.
 */

public class LargestPrime {

    public static int largestPrimeFactor(int number) {
        int i;
        int copyOfInput = number;

        if (number < 0) {
            return -1;
        }

        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return i;
    }

}
