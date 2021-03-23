package edu.ant.algorithms.data.structures.map;

import edu.ant.algorithms.data.structures.utils.HashedItem;
import edu.ant.algorithms.data.structures.utils.Item;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Chaining is another way of dealing with collisions.
 * */

public class ChainingHashMap {

    private final LinkedList<HashedItem>[] map;

    public ChainingHashMap() {
        map = new LinkedList[10];
        for (int i = 0; i < map.length; i++) {
            map[i] = new LinkedList<>();
        }
    }

    public void put(String key, Item item) {
        int hashedIndex = hash(key);
        map[hashedIndex].add(new HashedItem(key, item));
    }

    public Item get(String key) {
        int hashedIndex = hash(key);
        ListIterator<HashedItem> iterator = map[hashedIndex].listIterator();
        HashedItem hashedItem;

        while (iterator.hasNext()) {
            hashedItem = iterator.next();
            if (hashedItem.key().equals(key)) return hashedItem.item();
        }

        return null;
    }

    public Item remove(String key) {

        int hashedIndex = hash(key);
        ListIterator<HashedItem> iterator = map[hashedIndex].listIterator();
        HashedItem hashedItem = null;
        int index = -1;

        while (iterator.hasNext()) {
            hashedItem = iterator.next();
            index++;
            if (hashedItem.key().equals(key)) break;
        }

        if (hashedItem == null) {
            return null;
        } else {
            map[hashedIndex].remove(index);
            return hashedItem.item();
        }

    }

    private int hash(String key) {
        return Math.abs(key.hashCode() % map.length);
    }

}
