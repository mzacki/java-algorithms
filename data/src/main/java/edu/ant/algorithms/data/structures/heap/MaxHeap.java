package edu.ant.algorithms.data.structures.heap;

/**
 * Heap is binary tree that is complete, ie. every level is filled
 * (except for the last level that may be incomplete)
 * and in the last level all items are leftmost possible
 * see: full tree vs complete tree
 * Going trough left to right
 * Max heap: every parent >= child
 * Min heap: every parent <= child
 * Descending / ascending order when going from root to leaf
 * Owing to that, getting max / min is O (1)
 * Often implemented as array
 * */

public class MaxHeap {

    private final int[] items;
    private int currentSize;

    public MaxHeap(int maxSize) {
        items = new int[maxSize];
    }

    // add at the and heapify (fix the heap)
    public void add(int item) {
        if (currentSize == items.length) {
            throw new IndexOutOfBoundsException("Heap is already filled");
        }
        items[currentSize] = item;
        heapifyUpwards(currentSize);
        currentSize++;
    }

    public int remove(int index) {
        if (currentSize == items.length) {
            throw new IndexOutOfBoundsException("No items to remove");
        }

        int parent = getParent(index);
        int deletedValue = items[index];

        items[index] = items[currentSize - 1];

        if (index == 0 || items[index] < items[parent]) {
            heapifyBelow(index, currentSize - 1);
        } else heapifyUpwards(index);

        currentSize--;

        return deletedValue;

    }

    // heap sort
    // O (n * log n)
    private void sort() {
        int endIndex = currentSize - 1;
        for (int i = 0; i < endIndex; i++) {
            int tmp = items[0];
            items[0] = items[endIndex - i];
            items[endIndex - i] = tmp;

            heapifyBelow(0, endIndex - i - 1);
        }
    }

    // compare newly added item to its parent
    // and swap if necessary
    // we do not have to compare and order children
    // children may be unsorted when going from left to right
    private void heapifyUpwards(int index) {
        int addedItem = items[index];

        while (index > 0 && addedItem > items[getParent(index)]) {
            items[index] = items[getParent(index)];
            index = getParent(index);
        }

        items[index] = addedItem;
    }

    private void heapifyBelow(int index, int endIndex) {

        int toReplace;

        while (index <= endIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= endIndex) {

                if (rightChild > endIndex) {
                    toReplace = leftChild;
                } else {
                    toReplace = (items[leftChild] > items[rightChild] ?
                            leftChild : rightChild);
                }

                if (items[index] < items[toReplace]) {
                    int temp = items[index];
                    items[index] = items[toReplace];
                    items[toReplace] = temp;
                } else break;

                index = toReplace;
            } else break;
        }

    }

    /**
     * Formulas for getters in array implementation:
     * left child: 2i + 1
     * right child: 2i + 2
     * parent: (i - 1) / 2
     * */
    private int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

}
