package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 10:09.
 */

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {
            return false;
        }

        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

}
