package edu.ant.algorithms.algo.sort.insertion;

import edu.ant.algorithms.algo.sort.Sorter;

public class InsertionSort implements Sorter {

    private final int[] input;

    public InsertionSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {

        for (int lastSortedIndex = 1; lastSortedIndex < input.length; lastSortedIndex++) {
            for (int j = lastSortedIndex; j > 0; j--) {
                if (input[j - 1] > input[j]) {
                    swap(input, j - 1, j);
                }
            }
        }

        return input;
    }

    @Override
    public int[] reverseSort() {

        for (int lastSortedIndex = 1; lastSortedIndex < input.length; lastSortedIndex++) {
            for (int j = lastSortedIndex; j > 0; j--) {
                if (input[j - 1] < input[j]) {
                    swap(input, j - 1, j);
                }
            }
        }

        return input;
    }


}
