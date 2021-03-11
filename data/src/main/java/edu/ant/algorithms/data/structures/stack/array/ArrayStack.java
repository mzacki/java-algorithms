package edu.ant.algorithms.data.structures.stack.array;

import java.util.Arrays;


/**
 * LIFO
 * no random access (except for top item by peek method)
 * example: method call stack
 * O(n) for array implementation
 * array impl is preferable if max size is known and when memory is limited
 * */

public class ArrayStack<T> implements Stack<T> {

    private Object[] items;

    public ArrayStack() {
        items = new Object[0];
    }

    @Override
    public void push(T item) {
        Object[] newItems = Arrays.copyOf(items, items.length + 1);
        newItems[newItems.length - 1] = item;
        items = newItems;
    }

    @Override
    public T pop() {
        T removed = peek();
        items = Arrays.copyOf(items, items.length - 1);
        return removed;
    }

    @Override
    public T peek() {
        return (T) items[items.length - 1];
    }
}
