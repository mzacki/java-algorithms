package edu.ant.algorithms.math.fibonacci;

/**
 * Created by Matt on 04.11.2018 at 18:27.
 */
public class FibonacciFormula implements FibonacciSequence {

    public int countElement(int n) {
        return (int) Math.floor((Math.pow(PHI, n) - Math.pow((1 - PHI), n)) / Math.sqrt(5));
    }

}
