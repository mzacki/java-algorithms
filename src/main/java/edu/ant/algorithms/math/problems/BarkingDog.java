package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 21.12.2018 at 12:53.
 */

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || barking && hourOfDay >= 23) {
            return true;
        } else {
            return false;
        }
    }

}
