package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 23.12.2018 at 21:00.
 */

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }

    }
}
