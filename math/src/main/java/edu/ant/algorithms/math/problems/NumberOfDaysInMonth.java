package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 24.12.2018 at 15:06.
 */
public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;


    }

    public static int getDaysInMonth(int month, int year) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return days[month-1];
        }

    }
}
