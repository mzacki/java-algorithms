package edu.ant.algorithms.algo.sort.heap;

import edu.ant.algorithms.algo.sort.Sorter;
import java.util.Arrays;
import java.util.Collections;

public class HeapSort implements Sorter {

    private final int[] input;

    public HeapSort(int[] input) {
        this.input = input;
    }


    @Override
    public int[] sort() {
        heapBuild(input);
        heapSort(input);
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

    /**
     * Builds the heap by fixing upwards
     * (child not greater than its parent)
     */
    private void heapBuild(int[] input) {
        for (int i = 1; i < input.length; i++) {
            heapifyUpwards(input, i);
        }
    }

    /**
     * Fix the heap upwards:
     * starting from given index and checking indexes upwards
     * comparing input (child) with its parent
     */
    private void heapifyUpwards(int[] input, int index) {
        // there is nothing to fix above the root
        if (index > 0) {
            int parentIndex = getParent(index);
            // if child is greater than its parent -> swap them
            if (input[parentIndex] < input[index]) {
                swap(input, index, parentIndex);
                // continue checking upwards
                heapifyUpwards(input, parentIndex);
            }
        }
    }

    /**
     * In max heap, root is always the greatest value. In sorted heap / array, index 0 must be the lowest value.
     * Hence, the swap: root goes to the end of array.
     * Root part is already sorted, as the root is the greatest value.
     * Next the rest of array must be checked and sorted.
     */
    private void heapSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // swap the root and the last item
            // the end index - i omits already sorted part
            swap(input, 0, input.length - 1 - i);
            heapifyBelow(input, 0, input.length - 1 - i);
        }
    }

    /**
     * Fix the heap downwards:
     * starting from given parent index
     * going down below
     * comparing parent with its "bigger" child
     */
    private void heapifyBelow(int[] input, int index, int heapSize) {
        Integer olderChildIndex = getOlderChildIndex(input, index, heapSize);
        // must return Integer in order to do null check
        if(olderChildIndex != null && input[olderChildIndex] > input[index]) {
            // swap if greater child > parent and fix the rest
            swap(input, index, olderChildIndex);
            heapifyBelow(input, olderChildIndex, heapSize);
        }
    }

    private Integer getOlderChildIndex(int[] input, int index, int heapSize) {
        int leftChildIndex = getChild(index, true);
        // only left child (biggest index)
        if (leftChildIndex == heapSize - 1) {
            return leftChildIndex;
        } else if (leftChildIndex < heapSize - 1) {
            // both children
            int rightChildIndex = getChild(index, false);
            if (input[leftChildIndex] > input[rightChildIndex]) {
                return leftChildIndex;
            } else return rightChildIndex;
        } else return null; // no children
    }

    /**
     * For parent and child formulas explanation
     * see MaxHeap implementation
     * */
    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

}
