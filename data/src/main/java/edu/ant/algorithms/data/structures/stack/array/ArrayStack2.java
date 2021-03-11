package edu.ant.algorithms.data.structures.stack.array;

import edu.ant.patterns.utils.logger.LoggingService;
import java.util.EmptyStackException;

public class ArrayStack2<T> implements Stack<T> {

    private Object[] items;
    private int itemsCount;

    public ArrayStack2(int size) {
        items = new Object[size];
    }

    @Override
    public void push(T item) {
        if (itemsCount == this.items.length) {
            Object[] newItems = new Object[this.items.length * 2];
            System.arraycopy(this.items, 0, newItems, 0, this.items.length);
            this.items = newItems;
        }
        this.items[itemsCount++] = item;
    }

    @Override
    public T pop() {
        if (itemsCount == 0) {
            throw new EmptyStackException();
        }

        T item = (T) items[--itemsCount];
        items[itemsCount] = null;
        return item;
    }

    @Override
    public T peek() {
        if (itemsCount == 0) {
            throw new EmptyStackException();
        }

        return (T) items[itemsCount - 1];
    }

    public void log() {
            LoggingService.logMsg(items);
    }

}
