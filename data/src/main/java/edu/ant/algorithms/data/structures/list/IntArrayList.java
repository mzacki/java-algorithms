package edu.ant.algorithms.data.structures.list;

/**
 * - array takes a contiguous block of memory
 * - every array item needs the same memory space (primitive or object reference)
 * - hence it is possible to calculate memory address of an item using its index
 * - the solution: x + i * y
 *      x = starting memory address of an array
 *      i = ith item index
 *      y = size of an item in memory
 * - hence the random access (by index) to every item takes the same constant amount of time O(1)
 * - highly efficient structure - no need to store any value (e.g. address) with the item as it's easily calculable (contrary to e.g. linked list)
 * - WARNING! if index is not known, retrieving an item takes O(n) (worst-case)
 * */

public class IntArrayList {

    /**
     * Time complexity of array operations:
     * - access by index: O(1)
     * - access without index - worst case: O(n)
     * - add new element to full array: O(n) - need for new larger array (creation is content-independent, aways costs the same)
     * - add, insert, update, delete of given index: O(1)
     * - delete and shift remaining: O(n)
     * */

}
