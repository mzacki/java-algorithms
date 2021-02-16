package edu.ant.algorithms.algo.sort;

public interface Sorter {

    int[] sort();

    int[] reverseSort();

    default void swap(int[] input, int i, int j) {
        // secured against swapping equal items inadvertly
        // (which would make the implementation unstable event if algorithm itself is stable
        if (i == j) return;
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

}
