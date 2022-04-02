package edu.ant.algorithms.math.fibonacci;


/**
 * returns only nth number
 * */

public class FibonacciFaster {

    private FibonacciFaster() {}

    public static int fiboN(int n) {

        // where we are currently
        int current = 0;
        // equivalent of second seed
        int oneFibAgo = 1;
        // equivalent of first seed
        int twoFibAgo = 0;

        // e.g. {latter: 0, former: 1, current: 1}

        // first iteration skips and returns current as is (meaning: 0)
        for (int i = 2; i <= n; i++) {
            current = twoFibAgo + oneFibAgo;
            // do not increase seeds during second iteration (i.e. when i = 2)
            // because second and third number are the same (0, 1, 1...)
            // so third iteration should use the same seeds as the second
            if (i == 2) continue;
            twoFibAgo = oneFibAgo;
            oneFibAgo = current;
        }

        return current;
    }

}
