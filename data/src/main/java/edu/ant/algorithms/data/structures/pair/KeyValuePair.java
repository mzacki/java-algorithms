package edu.ant.algorithms.data.structures.pair;

public record KeyValuePair<S, T>(S key, T value) {

    public S getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

}
