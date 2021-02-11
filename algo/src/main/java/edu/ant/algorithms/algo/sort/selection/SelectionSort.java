package edu.ant.algorithms.algo.sort.selection;

import edu.ant.algorithms.algo.sort.Sorter;

/**
 * O (n * n)
 * unstable algorithm - not preserving order of equal elements
 **/

public class SelectionSort implements Sorter {

    private static final int BEGIN_INDEX = 0;
    private final int[] input;

    public SelectionSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {

        int minIndex = BEGIN_INDEX;

        for (int i = 0; i < input.length - 1; i++) {

            for (int j = i + 1; j < input.length; j++) {

                if (input[j] < input[minIndex]) {
                   swap(input, j, minIndex);
                }
            }
            minIndex++;
        }
        return input;
    }

    @Override
    public int[] reverseSort() {

        int maxIndex = BEGIN_INDEX;

        for (int i = 0; i < input.length - 1; i++) {

            for (int j = i + 1; j < input.length; j++) {

                if (input[j] > input[maxIndex]) {
                    swap(input, j, maxIndex);
                }
            }
            maxIndex++;
        }
        return input;
    }

}
