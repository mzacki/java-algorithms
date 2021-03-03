package edu.ant.algorithms.algo.sort.radix;

import edu.ant.algorithms.algo.sort.Sorter;
import java.util.Arrays;
import java.util.Collections;

/**
 * items to sort should have the same radix and width
 * radix - number of distinct characters / digits in number system
 * e.g. decimal - 10, binary - 2 etc.
 * width - number of characters / digits in every element of the collection
 * i.e. 10, 20, 30: width = 2
 * must use stable algorithm in background, e.g. counting sort (stable version)
 * can be in-place (depending on background algorithm)
 * O(n)
 * */

public class RadixSort implements Sorter {

    private final int[] input;
    private final int radix;
    private final int width;

    public RadixSort(int[] input, int radix, int width) {
        this.input = input;
        this.radix = radix;
        this.width = width;
    }

    @Override
    public int[] sort() {
        loopSortWithParams(input, radix, width);
        return input;
    }

    @Override
    public int[] reverseSort() {
        loopSortWithParams(input, radix, width);
        return Arrays.stream(input)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static void loopSortWithParams(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            mainSort(input, i, radix);
        }
    }

    private static void mainSort(int[] input, int position, int radix) {

        int numberOfElems = input.length;
        int[] helper = new int[radix];

        for (int value: input) {
            helper[getSingleDigit(position, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            helper[j] += helper[j - 1];
        }

        int[] tempArray = new int[numberOfElems];
        for (int tempIndex = numberOfElems - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--helper[getSingleDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }

        System.arraycopy(tempArray, 0, input, 0, numberOfElems);

    }

    private static int getSingleDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

}
