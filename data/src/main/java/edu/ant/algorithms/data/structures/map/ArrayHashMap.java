package edu.ant.algorithms.data.structures.map;

import edu.ant.algorithms.data.structures.utils.Item;

/**
 * Naive impl that doesn't manage collisions
 * hash function simplicistic
 * */

public class ArrayHashMap {

    private final Item[] items;

    public ArrayHashMap() {
        items = new Item[10];
    }

    public Item put(String key, Item item) {
        int hashIndex = hash(key);
        if (items[hashIndex] != null) {
            throw new ArrayStoreException();
        }
        items[hashIndex] = item;
        return item;
    }

    public Item get(String key) {
        int hashIndex = hash(key);
        return items[hashIndex];
    }

    private int hash(String key) {
        return key.length() % items.length;
    }

}
