package edu.ant.algorithms.algo.search.linear;

import edu.ant.algorithms.algo.search.SearchAlgorithm;

/**
 * Constraints:
 * - data needn't be sorted
 * - time complexity equals O(n)
 * */

public class LinearSearch extends SearchAlgorithm {

    public LinearSearch(int[] input, int target) {
        super(input, target);
    }

    @Override
    public int search() {
        for (int i = 0; i < getInput().length; i++) {
            if (getInput()[i] == getTarget()) {
                setIndexOfFound(i);
                setStep(i + 1);
                return i;
            }
        }
        return -1;
    }

    // returns worst-case scenario number of steps
    @Override
    public long maxStep() {
        return getInput().length;
    }

}
