package edu.ant.algorithms.algo.sort.bubble;

import edu.ant.algorithms.algo.sort.Sorter;

public class BubbleSort2 implements Sorter {

    private final int[] input;

    public BubbleSort2(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j + 1] < input[j]) {
                    swap(j + 1, j);
                }
            }
        }
        return input;
    }

    @Override
    public int[] reverseSort() {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j + 1] > input[j]) {
                    swap(j + 1, j);
                }
            }
        }
        return input;
    }

    private void swap(int i, int j) {
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

}
