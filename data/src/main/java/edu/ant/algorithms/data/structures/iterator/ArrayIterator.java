package edu.ant.algorithms.data.structures.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayIterator<E> implements Iterator<E> {

    private final E[] items;
    private int index;

    @SafeVarargs
    public ArrayIterator(E... items) {
        this.items = Objects.requireNonNull(items);
    }

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public E next() {
        if (hasNext()) {
            return items[index++];
        }
        throw new NoSuchElementException();
    }

    // TODO implementation of default method remove()

   // forEachRemaining() has default interface implementation

}
