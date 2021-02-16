package edu.ant.algorithms.data.structures.pair;

public class KeyValuePair<S, T> {

    private final S key;
    private final T value;

    public KeyValuePair(S key, T value) {
        this.key = key;
        this.value = value;
    }

    public S getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

}
