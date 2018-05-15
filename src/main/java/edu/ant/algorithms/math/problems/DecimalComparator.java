package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 21.12.2018 at 13:05.
 */

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        if ((int) (x * 1000) == (int) (y * 1000)) {
            return true;
        }
        return false;
    }

}
