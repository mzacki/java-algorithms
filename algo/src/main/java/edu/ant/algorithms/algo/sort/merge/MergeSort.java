package edu.ant.algorithms.algo.sort.merge;

import edu.ant.algorithms.algo.sort.Sorter;

/**
 * divide and conquer:
 * split (logical only, no new instances) and merge
 * recursive
 * !in-place (temp arrays in memory are created)
 * stable
 * O(n * log n)
 */

public class MergeSort implements Sorter {

    private static final int BEGIN_INDEX = 0;
    private final int[] input;

    public MergeSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        split(input, BEGIN_INDEX, input.length - 1, false);
        return input;
    }

    @Override
    public int[] reverseSort() {
        split(input, BEGIN_INDEX, input.length - 1, true);
        return input;
    }

    private static void split(int[] input, int startIndex, int endIndex, boolean reverse) {
        if (endIndex - startIndex < 1) return;

        int middleIndex = (startIndex + endIndex) / 2;

        split(input, startIndex, middleIndex, reverse);
        split(input, middleIndex + 1, endIndex, reverse);

        if (reverse) {
            reverseMerge(input, startIndex, middleIndex, endIndex);
        } else {
            merge(input, startIndex, middleIndex, endIndex);
        }
    }

    private static void merge(int[] input, int startIndex, int middleIndex, int endIndex) {
        if (input[middleIndex] <= input[middleIndex + 1]) return;

        int leftPartIndex = startIndex;
        int rightPartIndex = middleIndex + 1;
        int mergedIndex = 0;

        int[] merged = new int[endIndex - startIndex + 1];

        while (leftPartIndex <= middleIndex && rightPartIndex <= endIndex) {
            merged[mergedIndex++] = input[leftPartIndex] <= input[rightPartIndex] ? input[leftPartIndex++] : input[rightPartIndex++];
        }

        if (rightPartIndex > endIndex) {
            while (leftPartIndex <= middleIndex) {
                merged[mergedIndex] = input[leftPartIndex];
                leftPartIndex++;
                mergedIndex++;
            }
        }

        if (leftPartIndex > middleIndex) {
            while (rightPartIndex <= endIndex) {
                merged[mergedIndex] = input[rightPartIndex];
                rightPartIndex++;
                mergedIndex++;
            }
        }

        System.arraycopy(merged, 0, input, startIndex, mergedIndex);
    }

    private static void reverseMerge(int[] input, int startIndex, int middleIndex, int endIndex) {
        if (input[middleIndex] >= input[middleIndex + 1]) return;

        int leftPartIndex = startIndex;
        int rightPartIndex = middleIndex + 1;
        int mergedIndex = 0;

        int[] merged = new int[endIndex - startIndex + 1];

        while (leftPartIndex <= middleIndex && rightPartIndex <= endIndex) {
            merged[mergedIndex++] = input[leftPartIndex] >= input[rightPartIndex] ? input[leftPartIndex++] : input[rightPartIndex++];
        }

        if (rightPartIndex > endIndex) {
            while (leftPartIndex <= middleIndex) {
                merged[mergedIndex] = input[leftPartIndex];
                leftPartIndex++;
                mergedIndex++;
            }
        }

        if (leftPartIndex > middleIndex) {
            while (rightPartIndex <= endIndex) {
                merged[mergedIndex] = input[rightPartIndex];
                rightPartIndex++;
                mergedIndex++;
            }
        }

        System.arraycopy(merged, 0, input, startIndex, mergedIndex);
    }

}
