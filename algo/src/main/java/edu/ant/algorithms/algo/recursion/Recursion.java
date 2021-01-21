package edu.ant.algorithms.algo.recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(powerOf(4, 3));
    }

    private static int factorial(int n) {
        if (n > 0) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }

    private static int powerOf(int a, int b) {
        if (b < 1) {
            return 1;
        } else {
            return powerOf(a, b - 1) * a;
        }
    }

}
