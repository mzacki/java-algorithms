package edu.ant.algorithms.algo.sort.selection;

import edu.ant.algorithms.algo.sort.Sorter;

public class SelectionSort3 implements Sorter {

    private final int[] input;

    public SelectionSort3(int[] input) {
        this.input = input;
    }

    /**
     * Mirrored solution from SelectionSort2
     *  starting from the end of collection
     *  and going backwards
     *  looking for the biggest item
     *  to sort first
     * */

    @Override
    public int[] sort() {

        for (int alreadySortedIndex = input.length - 1;
                alreadySortedIndex > 0;
                alreadySortedIndex--) {

            int largestIndex = 0;

            for (int j = 1; j <= alreadySortedIndex; j++) {
                if (input[j] > input[largestIndex]) {
                    largestIndex = j;
                }
            }
            swap(input, largestIndex, alreadySortedIndex);
        }
        return input;
    }

    @Override
    public int[] reverseSort() {

        for (int alreadySortedIndex = input.length - 1;
                alreadySortedIndex > 0;
                alreadySortedIndex--) {

            int smallestIndex = 0;

            for (int j = 1; j <= alreadySortedIndex; j++) {
                if (input[j] < input[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(input, smallestIndex, alreadySortedIndex);
        }
        return input;
    }

}
