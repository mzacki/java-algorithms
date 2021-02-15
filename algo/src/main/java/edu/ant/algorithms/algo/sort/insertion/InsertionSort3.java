package edu.ant.algorithms.algo.sort.insertion;

import edu.ant.algorithms.algo.sort.Sorter;

public class InsertionSort3 implements Sorter {

    private final int[] input;

    public InsertionSort3(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {

        for (int lastSortedIndex = 1; lastSortedIndex < input.length; lastSortedIndex++) {

            int currentlyChecked = input[lastSortedIndex];
            int j;

            for (j = lastSortedIndex; j > 0 && input[j - 1] > currentlyChecked; j--) {
                input[j] = input[j - 1];
            }
            input[j] = currentlyChecked;
        }
        return input;
    }

    @Override
    public int[] reverseSort() {

        for (int lastSortedIndex = 1; lastSortedIndex < input.length; lastSortedIndex++) {

            int currentlyChecked = input[lastSortedIndex];
            int j;

            for (j = lastSortedIndex; j > 0 && input[j - 1] < currentlyChecked; j--) {
                input[j] = input[j - 1];
            }
            input[j] = currentlyChecked;
        }
        return input;
    }

}
