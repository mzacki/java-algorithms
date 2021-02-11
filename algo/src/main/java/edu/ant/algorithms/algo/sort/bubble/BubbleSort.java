package edu.ant.algorithms.algo.sort.bubble;

import edu.ant.algorithms.algo.sort.Sorter;

/**
 * O(n * n)
 * In-place algorithm
 * */

public class BubbleSort implements Sorter {

    private int lastUnsortedIndex;
    private final int[] input;

    public BubbleSort(int[] input) {
        this.input = input;
        lastUnsortedIndex = input.length - 1;
    }

    @Override
    public int[] sort() {

        while (lastUnsortedIndex > 0) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i, i + 1);
                }
            }
            lastUnsortedIndex--;
        }

        return input;
    }

    @Override
    public int[] reverseSort() {

        while (lastUnsortedIndex > 0) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (input[i] < input[i + 1]) {
                    swap(input, i, i + 1);
                }
            }
            lastUnsortedIndex--;
        }

        return input;
    }

}
