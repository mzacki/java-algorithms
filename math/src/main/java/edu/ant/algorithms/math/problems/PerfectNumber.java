package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 11:20.
 */

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        int divisor = number -1;
        while (divisor > 0) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor--;
        }
        return number == sum;
    }
}
