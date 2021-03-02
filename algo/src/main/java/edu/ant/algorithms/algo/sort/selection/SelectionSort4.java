package edu.ant.algorithms.algo.sort.selection;

import edu.ant.algorithms.algo.sort.Sorter;

public class SelectionSort4 implements Sorter {

    private static final int BEGIN_INDEX = 0;
    private final int[] input;

    public SelectionSort4(int[] input) {
        this.input = input;
    }


    @Override
    public int[] sort() {
        for (int i = 0; i < input.length - 1; i++) {
            int maxIndex = BEGIN_INDEX;
            for (int j = 1; j < input.length - i; j++) {
                if (input[maxIndex] < input[j]) {
                    maxIndex = j;
                }
            }
            swap(input, input.length - 1 - i, maxIndex);
        }
        return input;
    }

    @Override
    public int[] reverseSort() {
        for (int i = 0; i < input.length - 1; i++) {
            int maxIndex = BEGIN_INDEX;
            for (int j = 1; j < input.length - i; j++) {
                if (input[maxIndex] > input[j]) {
                    maxIndex = j;
                }
            }
            swap(input, input.length - 1 - i, maxIndex);
        }
        return input;
    }
}
