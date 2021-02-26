package edu.ant.algorithms.algo.sort.merge;

import edu.ant.algorithms.algo.sort.Sorter;

public class MergeSort3 implements Sorter {

    private static final int BEGIN_INDEX = 0;
    private final int[] input;

    public MergeSort3(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        splitAndSort(input, BEGIN_INDEX, input.length - 1, false);
        return input;
    }

    @Override
    public int[] reverseSort() {
        splitAndSort(input, BEGIN_INDEX, input.length - 1, true);
        return input;
    }

    private static void splitAndSort(int[] input, int startIndex, int endIndex, boolean reverse) {
        int length = endIndex - startIndex + 1;

        if (length == 2) {
            // here is where sort is done
            // disputable: instead of logical, in-place sort
            // new array is created
            // also comparing is being done in two places
            if (compare(input[startIndex], input[endIndex], reverse)) {
                swapSorted(input, startIndex, endIndex);
            }
        } else if (length > 2) {
            int middleIndex = (startIndex + endIndex) / 2;
            splitAndSort(input, startIndex, middleIndex, reverse);
            splitAndSort(input, middleIndex + 1, endIndex, reverse);
            merge(input, startIndex, middleIndex, endIndex, reverse);
        }
    }

    private static void merge(int[] input, int startIndex, int middleIndex, int endIndex, boolean reverse) {
        int[] merged = new int[endIndex - startIndex + 1];
        int leftPartIndex = startIndex;
        int rightPartIndex = middleIndex + 1;
        int mergedIndex = 0;

        while (leftPartIndex <= middleIndex && rightPartIndex <= endIndex) {
            if (compare(input[rightPartIndex], input[leftPartIndex], reverse)) {
                merged[mergedIndex] = input[leftPartIndex];
                leftPartIndex++;
            } else {
                merged[mergedIndex] = input[rightPartIndex];
                rightPartIndex++;
            }
            mergedIndex++;
        }

        for (; leftPartIndex <= middleIndex; leftPartIndex++) {
            merged[mergedIndex] = input[leftPartIndex];
            mergedIndex++;
        }
        for (; rightPartIndex <= endIndex; rightPartIndex++) {
            merged[mergedIndex] = input[rightPartIndex];
            mergedIndex++;
        }

        for (mergedIndex = 0; mergedIndex < merged.length; mergedIndex++) {
            input[startIndex + mergedIndex] = merged[mergedIndex];
        }
    }

    private static void swapSorted(int[] input, int i, int j) {
        if (i == j) return;
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

    private static boolean compare(int i, int j, boolean reverse) {
        return reverse ? i < j : i > j;
    }

}
