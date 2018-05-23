package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 28.12.2018 at 11:11.
 */

public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int temp = 1;
        while (temp <= number) {
            if (number % temp == 0) {
                System.out.println(temp);
            }
            temp++;
        }
    }

}
