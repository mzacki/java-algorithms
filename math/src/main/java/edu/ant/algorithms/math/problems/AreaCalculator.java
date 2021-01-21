package edu.ant.algorithms.math.problems;

/**
 * Created by Matt on 23.12.2018 at 20:13.
 */

public class AreaCalculator {

    public static final double PI = 3.14159;

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }

        return radius * radius * PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

}
