package edu.ant.algorithms.algo.sort.bubble;

import edu.ant.algorithms.algo.sort.Sorter;

public class BubbleSort3 implements Sorter {

    private final int[] input;

    public BubbleSort3(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        for (int lastUnsortedIndex = input.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i, i + 1);
                }
            }
        }
        return input;
    }

    @Override
    public int[] reverseSort() {
        for (int lastUnsortedIndex = input.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (input[i] < input[i + 1]) {
                    swap(input, i, i + 1);
                }
            }
        }
        return input;
    }

    private void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
