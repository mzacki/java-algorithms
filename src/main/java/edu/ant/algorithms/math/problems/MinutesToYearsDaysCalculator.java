package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 23.12.2018 at 20:21.
 */

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-561600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            if (minutes < 525600){
                days = minutes / 1440;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
