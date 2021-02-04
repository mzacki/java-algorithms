package edu.ant.algorithms.algo.search.binary;

import edu.ant.algorithms.algo.search.SearchAlgorithm;
import edu.ant.algorithms.math.logarithm.Logarithm;

/**
 * Constraints:
 * - data must be sorted
 * - time complexity equals O(log n)
 * */

public class BinarySearch extends SearchAlgorithm {


    public BinarySearch(int[] input, int target) {
        super(input, target);
    }

    @Override
    public int search() {
        int low = 0;
        int high = getInput().length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int index = getInput()[mid];
            setStep(getStep() + 1);

            if (index == getTarget()) {
                setIndexOfFound(mid);
                return mid;
            } else if (index > getTarget()) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    @Override
    public long maxStep() {
        return (long) Logarithm.of(2, getInput().length);
    }

}
