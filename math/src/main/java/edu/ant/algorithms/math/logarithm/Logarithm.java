package edu.ant.algorithms.math.logarithm;

public class Logarithm {

    private Logarithm() {}

    public static double of(double base, double n) {
        return Math.log(n) / Math.log(base);
    }

}
