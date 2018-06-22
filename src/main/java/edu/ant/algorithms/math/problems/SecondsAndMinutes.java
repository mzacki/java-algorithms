package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 23.12.2018 at 19:26.
 */

public class SecondsAndMinutes {

    public static void main(String[] args) {
        //System.out.println(getDurationString(789, 59));

        System.out.println(getDurationString(58));
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;
        int leftMinutes = minutes % 60;

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        return hours + "h " + leftMinutes + "m " + seconds + "s";

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid input";
        }
            int minutes = seconds / 60;
            seconds = seconds % 60;

            return getDurationString(minutes, seconds);

    }
}
