package edu.ant.algorithms.algo.sort.bucket;

import edu.ant.algorithms.algo.sort.Sorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * O(n)
 * assumptions
 * hashing
 * !in-place
 * */

public class BucketSort implements Sorter {

    private final int[] input;

    public BucketSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {
        // create array of buckets
        List<Integer>[] bucketArray = new List[10];

        // insert new array list into each bucket in the array
        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new ArrayList<>();
        }

        // pre-sort: assign each input to buckets under hashed index
        // bigger value = bigger index
        for (int k : input) {
            bucketArray[hash(k)].add(k);
        }

        // in case of collision bucket may contain more entries
        // which are to be sorted now
        for (List bucket: bucketArray) {
            // stability / unstability of entire implementation depends on
            // the algo used here
            Collections.sort(bucket);
        }

        // final sort: entry by entry, bucket after bucket
        // ordered items to replace initial values in the input array
        int j = 0;
        for (List<Integer> bucket : bucketArray) {
            for (int value : bucket) {
                input[j++] = value;
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

    private static int hash(int value) {
        return value / 10;
    }

}
