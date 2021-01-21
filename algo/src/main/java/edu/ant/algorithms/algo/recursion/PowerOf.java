package edu.ant.algorithms.algo.recursion;

public class PowerOf {

    private PowerOf() {}

    static int powerOf(int a, int b) {

        if (b == 0) {
            return 1;
        }

        if (b == 1) {
            return a;
        }

        return powerOf(a, b - 1) * a;
    }

}
