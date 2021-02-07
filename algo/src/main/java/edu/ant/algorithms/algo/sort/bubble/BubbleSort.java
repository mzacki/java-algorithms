package edu.ant.algorithms.algo.sort.bubble;

import edu.ant.algorithms.algo.sort.Sorter;

/**
 * O(n * n)
 * In-place algorithm
 * */

public class BubbleSort implements Sorter {

    private int unsortedPartitionIndex;
    private final int[] input;

    public BubbleSort(int[] input) {
        this.input = input;
        unsortedPartitionIndex = input.length - 1;
    }

    @Override
    public int[] sort() {

        while (unsortedPartitionIndex > 0) {

            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (input[i] > input[i + 1]) {
                    swap(i, i + 1);
                }
            }
            unsortedPartitionIndex--;
        }

        return input;
    }

    @Override
    public int[] reverseSort() {

        while (unsortedPartitionIndex > 0) {

            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (input[i] < input[i + 1]) {
                    swap(i, i + 1);
                }
            }
            unsortedPartitionIndex--;
        }

        return input;
    }

    private void swap(int i, int j) {
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

}
