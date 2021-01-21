package edu.ant.algorithms.math.fibonacci;

/**
 * Created by Matt on 04.11.2018 at 18:27.
 */
public class FibonacciRecursive {

    public int countElement(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return countElement(n - 1) + countElement(n - 2);
        }
    }

}
