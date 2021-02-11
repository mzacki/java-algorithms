package edu.ant.algorithms.algo.sort.insertion;

import edu.ant.algorithms.algo.sort.Sorter;

public class InsertionSort2 implements Sorter {

    private final int[] input;

    public InsertionSort2(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {

        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (j > 0 && input[j] < input[j - 1]) {
                swap(input, j, j - 1);
                j--;
            }
        }

        return input;
    }

    @Override
    public int[] reverseSort() {

        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (j > 0 && input[j] > input[j - 1]) {
                swap(input, j, j - 1);
                j--;
            }
        }

        return input;
    }

}
