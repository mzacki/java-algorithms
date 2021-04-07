package edu.ant.algorithms.data.structures.container;

public record Container<T>(T item) {

    public T getItem() {
        return item;
    }

}
