package com.beehive.algorithms.numbers;

/**
 * Created by Matt on 25.12.2018 at 12:46.
 */
public class SumOddRange {

    public static boolean isOdd(int number) {

        if (number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        if (end < start || start < 0 || end < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
