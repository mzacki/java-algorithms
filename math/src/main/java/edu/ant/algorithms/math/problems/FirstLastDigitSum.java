package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 09:06.
 */

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int last = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        return number + last;
    }

}
