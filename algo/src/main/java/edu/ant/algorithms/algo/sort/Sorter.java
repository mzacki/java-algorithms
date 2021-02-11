package edu.ant.algorithms.algo.sort;

public interface Sorter {

    int[] sort();

    int[] reverseSort();

    default void swap(int[] input, int i, int j) {
        if (i == j) return;
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

}
