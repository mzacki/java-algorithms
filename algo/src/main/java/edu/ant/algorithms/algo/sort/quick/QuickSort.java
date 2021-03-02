package edu.ant.algorithms.algo.sort.quick;

import edu.ant.algorithms.algo.sort.Sorter;
import java.util.Arrays;
import java.util.Collections;

/**
 * Worst case: O(n * n)
 * Average case: O(n * log n)
 * Recursive algorithm
 * Divide and conquer (inductive proof)
 * In-place (memory-efficient)
 * Unstable
 * */

public class QuickSort implements Sorter {

    private static final int BEGIN_INDEX = 0;
    private final int[] input;

    public QuickSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        conquer(input, BEGIN_INDEX, input.length);
        return input;
    }

    //TODO implement low level reverse quick sort without pre-defined methods
    @Override
    public int[] reverseSort() {
        conquer(input, BEGIN_INDEX, input.length);
        return Arrays.stream(input)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static void conquer(int[] input, int beginIndex, int limes) {
        if (limes - beginIndex < 2) {
            return;
        }

        int pivotIndex = divide(input, beginIndex, limes);
        conquer(input, beginIndex, pivotIndex);
        conquer(input, pivotIndex + 1, limes);
    }

    private static int divide(int[] input, int beginIndex, int limes) {
        int pivot = input[beginIndex];
        int leftIndex = beginIndex;
        int rightIndex = limes;

        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && input[--rightIndex] >= pivot);
            if (leftIndex < rightIndex) {
                input[leftIndex] = input[rightIndex];
            }

            while (leftIndex < rightIndex && input[++leftIndex] <= pivot);
            if (leftIndex < rightIndex) {
                input[rightIndex] = input[leftIndex];
            }
        }
        input[rightIndex] = pivot;
        return rightIndex;
    }

}
