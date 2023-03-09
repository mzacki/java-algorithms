package edu.ant.algorithms.puzzle.solutions.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the
 * same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
 * (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
 *
 *
 * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3 maxMirror([1, 2, 1, 4]) → 3 maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 */

public class MaxMirror {

    public static void main(String[] args) {
        int[] input = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};
        System.out.println(maxMirror(input));
    }

    public static int maxMirror(int[] nums) {

        List<Integer> results = new ArrayList<>();

        StringBuilder initialArray = new StringBuilder();
        Arrays.stream(nums).forEach(initialArray::append);
        String initialArrayAsString = initialArray.toString();

        int startIndex = 0;
        while (startIndex < nums.length) {
            List<Integer> toFindArray = new ArrayList<>();
            for (int i = startIndex; i < nums.length; i++) {
                toFindArray.add(nums[i]);
                StringBuilder sb = new StringBuilder();
                for (int j = toFindArray.size() - 1; j >= 0; j--) {
                    sb.append(toFindArray.get(j));
                }
                String toFindReversed = sb.toString();
                if (initialArrayAsString.contains(toFindReversed)) {
                    results.add(toFindArray.size());
                }
            }
            startIndex++;
        }
        return results.stream().mapToInt(r -> r).max().orElse(0);
    }

}
