package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 09:15.
 */

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int last = number % 10;
            if (last % 2 == 0) {
                sum += last;
            }
            number /= 10;
        }
        return sum;
    }

}
