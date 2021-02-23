package edu.ant.algorithms.algo.sort.shell;

import edu.ant.algorithms.algo.sort.Sorter;

/**
 * Insertion sort enhanced by Shell algorithm:
 * O(n * n) (worst case, may behave better depending on the gap
 * unstable
 * in-place
 * modification of bubble sort / insertion sort (less swapping, if gap = 1, it's insertion sort)
 * */
// TODO improve bubble sort in the same way
public class ShellSort implements Sorter {

    private final int[] input;

    public ShellSort(int[] input) {
        this.input = input;
    }

    @Override
    public int[] sort() {

        for (int gap = input.length / 2; gap > 0; gap /= 2) {

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
        for (int gap = input.length / 2; gap > 0; gap /= 2) {

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
