package edu.ant.algorithms.data.structures.stack;

import java.util.Arrays;

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
