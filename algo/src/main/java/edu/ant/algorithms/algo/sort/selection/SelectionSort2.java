package edu.ant.algorithms.algo.sort.selection;

import edu.ant.algorithms.algo.sort.Sorter;

public class SelectionSort2 implements Sorter {

    private final int[] input;

    public SelectionSort2(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {

        for (int alreadySortedIndex = 0;
                alreadySortedIndex < input.length - 1;
                alreadySortedIndex++) {

            int smallestIndex = alreadySortedIndex;
            for (int j = alreadySortedIndex + 1; j < input.length; j++) {

                if (input[j] < input[smallestIndex]) {
                    smallestIndex = j;
                }

            }
            // max one swap per internal iteration which is more efficient
            // than previous implementation SelectionSort
            if (input[smallestIndex] < input[alreadySortedIndex]) {
                swap(input, smallestIndex, alreadySortedIndex);
            }

        }
        return input;
    }

    @Override
    public int[] reverseSort() {

        for (int alreadySortedIndex = 0;
                alreadySortedIndex < input.length - 1;
                alreadySortedIndex++) {

            int largestIndex = alreadySortedIndex;
            for (int j = alreadySortedIndex + 1; j < input.length; j++) {

                if (input[j] > input[largestIndex]) {
                    largestIndex = j;
                }

            }

            if (input[largestIndex] > input[alreadySortedIndex]) {
                swap(input, largestIndex, alreadySortedIndex);
            }

        }
        return input;
    }

}
