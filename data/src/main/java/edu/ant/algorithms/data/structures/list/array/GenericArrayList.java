package edu.ant.algorithms.data.structures.list.array;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/**
 * - array takes a contiguous block of memory - every array item needs the same memory space (primitive or object
 * reference) - hence it is possible to calculate memory address of an item using its index - the solution: x + i * y x
 * = starting memory address of an array i = ith item index y = size of an item in memory - hence the random access (by
 * index) to every item takes the same constant amount of time O(1) - highly efficient structure - no need to store any
 * value (e.g. address) with the item as it's easily calculable (contrary to e.g. linked list) - WARNING! if index is
 * not known, retrieving an item takes O(n) (worst-case)
 */

public class GenericArrayList<E> {

    /**
     * Time complexity of array operations: - access by index: O(1) - access without index - worst case: O(n) - add new
     * element to full array: O(n) - need for new larger array (creation is content-independent, aways costs the same) -
     * add, insert, update, delete of given index: O(1) - delete and shift remaining: O(n)
     */

    private E[] items;

    public GenericArrayList(Class<E> klazz) {
        this.items = (E[]) Array.newInstance(klazz, 0);
    }

    public GenericArrayList(E[] input, Class<E> klazz) {
        this.items = (E[]) Array.newInstance(klazz, input.length);
        System.arraycopy(input, 0, this.items, 0, input.length);
    }

    public void add(E newItem) {
        E[] resized = (E[]) Array.newInstance(newItem.getClass(), items.length + 1);
        System.arraycopy(items, 0, resized, 0, items.length);
        resized[items.length] = newItem;
        items = resized;
    }

    public void remove(int index) throws NoSuchElementException {
        if (index < 0 || index > items.length - 1) {
            throw new NoSuchElementException();
        }
        E[] downsized = (E[]) Array.newInstance(items[index].getClass(), items.length - 1);
        System.arraycopy(items, 0, downsized, 0, index);

        if (items.length - (index + 1) >= 0) {
            System.arraycopy(items, index + 1, downsized, index + 1 - 1, items.length - (index + 1));
        }
        items = downsized;
    }

    public E get(int index) {
        if (index < 0 || index > items.length - 1) {
            throw new NoSuchElementException();
        }
        return items[index];
    }

    public void removeObject(E toRemove) {

        int occurrences = 0;

        for (E item : items) {
            if (item.equals(toRemove)) {
                occurrences++;
            }
        }

        E[] downsized = (E[]) Array.newInstance(toRemove.getClass(), items.length - occurrences);
        int targetIndex = 0;

        for (E item : items) {

            if (item != toRemove) {
                downsized[targetIndex] = item;
                targetIndex++;
            }

        }
        items = downsized;
    }

}
