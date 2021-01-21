package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 21.12.2018 at 12:59.
 */

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
