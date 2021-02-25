package edu.ant.algorithms.algo.sort.merge;

import edu.ant.algorithms.algo.sort.Sorter;

public class MergeSort2 implements Sorter {

    private static final int BEGIN_INDEX = 0;
    private final int[] input;

    public MergeSort2(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        split(input, BEGIN_INDEX, input.length, false);
        return input;
    }

    @Override
    public int[] reverseSort() {
        split(input, BEGIN_INDEX, input.length, true);
        return input;
    }

    private static void split(int[] input, int startIndex, int limes, boolean reverse) {
        if (limes - startIndex < 2) return;

        int middleIndex = (startIndex + limes) / 2;
        split(input, startIndex, middleIndex, reverse);
        split(input, middleIndex, limes, reverse);

        if (reverse) {
            reverseMerge(input, startIndex, middleIndex, limes);
        } else {
            merge(input, startIndex, middleIndex, limes);
        }

    }

    private static void merge(int[] input, int startIndex, int midIndex, int limes) {
        if (input[midIndex - 1] <= input[midIndex]) return;

        int i = startIndex;
        int j = midIndex;
        int mergedIndex = 0;

        int[] merged = new int[limes - startIndex];
        while (i < midIndex && j < limes) {
            merged[mergedIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, startIndex + mergedIndex, midIndex - i);
        System.arraycopy(merged, 0, input, startIndex, mergedIndex);
    }

    private static void reverseMerge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] >= input[mid]) return;

        int i = start;
        int j = mid;
        int mergedIndex = 0;

        int[] merged = new int[end - start];
        while (i < mid && j < end) {
            merged[mergedIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + mergedIndex, mid - i);
        System.arraycopy(merged, 0, input, start, mergedIndex);
    }

}
