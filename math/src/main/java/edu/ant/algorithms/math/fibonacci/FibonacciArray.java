package edu.ant.algorithms.math.fibonacci;

/*
* Using memoization - caching
* returns sequence array
* */

public class FibonacciArray {

    private FibonacciArray() {}

    public static int[] countSequence(int lastN) {

        int[] sequence = new int[lastN];

        // adding seed
        sequence[0] = 0;

        // adding another seed only if array length > 1
        if (lastN > 1) {
            sequence[1] = 1;
        }

        for (int i = 2; i < lastN; i++) {
            sequence[i] = sequence[i - 2] + sequence[i - 1];
        }

        return sequence;
    }

}
