package edu.ant.algorithms.algo.sort.counting;

import edu.ant.algorithms.algo.sort.Sorter;
import java.util.Arrays;
import java.util.Collections;

/**
 * EXPERIMENTAL VERSION NOT FULLY TESTED
 * for small collections only:
 * number of elements to sort should approx equal their range
 * (e.g. 10 items, 0-10 each)
 * for non-negative integers only
 * makes no comparision of elements
 * needs a helper array, where indexes reflect values in original array
 * as values, helper array holds number of occurrences of values in original array
 * for example:
 * [0, 1, 2, 3] - original
 * [1, 1, 1, 1] - helper
 * complexity O(n)
 * !in-place
 * CAN be stable
 * */

public class CountingSort implements Sorter {

    private final int[] input;

    public CountingSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        int min = min(input);
        int max = max(input);

        int[] helper = new int[(max - min) + 1];

        for (int k : input) {
            helper[k - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (helper[i - min] > 0) {
                input[j++] = i;
                helper[i - min]--;
            }
        }
        return input;
    }

    @Override
    public int[] reverseSort() {
        sort();
        return Arrays.stream(input)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }


    private static int max(int[] input) {
        if (input.length == 1) return input[0];
        int i = 1;
        int result = 0;
        while (i < input.length) {
            if (input[i] > result) {
                result = input[i];
            }
            i++;
        }
        return result;
    }

    private static int min(int[] input) {
        if (input.length == 1) return input[0];
        int i = 1;
        int result = 0;
        while (i < input.length) {
            if (input[i] < result) {
                result = input[i];
            }
            i++;
        }
        return result;
    }

}
