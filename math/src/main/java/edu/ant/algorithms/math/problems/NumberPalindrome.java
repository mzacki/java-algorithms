package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 27.12.2018 at 19:55.
 */

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        number = number < 0 ? number / -1 : number;

        int pattern = number;
        int reverse = 0;
        int lastDigit;

        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }

        return pattern == reverse ? true : false;
    }
}
