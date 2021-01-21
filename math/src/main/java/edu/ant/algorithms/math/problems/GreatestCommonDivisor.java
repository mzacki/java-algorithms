package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 10:57.
 */

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 0 || second < 0) {
            return -1;
        }
        int bigger;
        int smaller;
        if (first >= second) {
            bigger = first;
            smaller = second;
        } else {
            bigger = second;
            smaller = first;
        }
        int divisor = 0;
        int temp = smaller;
        while (temp > 0) {
            if (bigger % temp == 0 && smaller % temp == 0) {
                divisor = temp;
                break;
            }
            temp--;
        }
        return divisor;
    }

}
