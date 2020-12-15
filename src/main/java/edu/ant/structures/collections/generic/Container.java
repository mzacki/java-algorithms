package edu.ant.structures.collections.generic;

public class Container<T> {

    private final T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}