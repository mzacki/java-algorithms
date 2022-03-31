package edu.ant.algorithms.algo.search.duplicate;

import edu.ant.algorithms.algo.search.SearchAlgorithm;

/**
 * Constraints:
 * - data must be sorted
 * - works for integers > 0 with max one duplicate
 * - uses Gauss formula
 * - time complexity equals O(n) - even better than alternatives:
 * -- iteration within iteration: O(n) * O(n) = n^2
 * -- iteration with binary search: O(n * log n)
 * */

public class OneDuplicateSortedNumbers extends SearchAlgorithm {

    protected OneDuplicateSortedNumbers(int[] input) {
        super(input);
    }

    @Override
    public int search() {

        int actualSum = 0;
        for (int i = 0; i < getInput().length; i++) {
            actualSum += getInput()[i];
        }

        int lastNumber = getInput()[getInput().length - 1];

        // from the Gauss formula
        // counting sum of numbers from 1 to n...
        int expectedSum =  lastNumber * (lastNumber + 1) / 2;

        return actualSum - expectedSum;

    }

    @Override
    public long maxStep() {
        return getInput().length;
    }

}
