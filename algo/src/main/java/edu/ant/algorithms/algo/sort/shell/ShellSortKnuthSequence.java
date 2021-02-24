package edu.ant.algorithms.algo.sort.shell;

import edu.ant.algorithms.algo.sort.Sorter;
import edu.ant.algorithms.math.knuth.KnuthSequence;

/**
 * Knuth sequence is considered as the most effective
 * way to count optimal gap size
 */
public class ShellSortKnuthSequence implements Sorter {

    private final int[] input;
    private final int knuthSequenceNumber;

    public ShellSortKnuthSequence(int[] input) {
        this.input = input;
        this.knuthSequenceNumber = (int) KnuthSequence.getHighestOfRange(input.length);
    }

    @Override
    public int[] sort() {

        for (int gap = knuthSequenceNumber; gap > 0; gap = (gap - 1) / 3) {

            for (int i = gap; i < input.length; i++) {

                int current = input[i];
                int j = i;

                while (j >= gap && input[j - gap] > current) {
                    input[j] = input[j - gap];
                    j -= gap;
                }
                input[j] = current;
            }
        }
        return input;
    }

    @Override
    public int[] reverseSort() {

        for (int gap = knuthSequenceNumber; gap > 0; gap = (gap - 1) / 3) {

            for (int i = gap; i < input.length; i++) {

                int current = input[i];
                int j = i;

                while (j >= gap && input[j - gap] < current) {
                    input[j] = input[j - gap];
                    j -= gap;
                }
                input[j] = current;
            }
        }
        return input;
    }

}
