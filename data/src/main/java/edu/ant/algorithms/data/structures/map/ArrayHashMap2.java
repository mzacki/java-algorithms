package edu.ant.algorithms.data.structures.map;

import edu.ant.algorithms.data.structures.utils.Item;

/**
 * Including linear probing / open addressing
 */

public class ArrayHashMap2 {

    private static record SavedItem(String key, Item item) {}
    private SavedItem[] map;

    public ArrayHashMap2() {
        map = new SavedItem[10];
    }

    public void put(String key, Item item) throws HashMapStoreException {
        int hashIndex = hash(key);

        if (isTaken(hashIndex)) {

            int endIndex = hashIndex;
            hashIndex = hashIndex == map.length - 1 ? 0 : hashIndex + 1;

            while (isTaken(hashIndex) && hashIndex != endIndex) {
                hashIndex = (hashIndex + 1) % map.length;
            }
        }

        if (isTaken(hashIndex)) {
            throw new HashMapStoreException("Index taken " + hashIndex);
        } else {
            map[hashIndex] = new SavedItem(key, item);
        }

    }

    public Item get(String key) {
        int hashIndex = getKey(key);

        if (hashIndex == -1) return null;

        return map[hashIndex].item;
    }

    public Item remove(String key) throws HashMapStoreException {
        int hashIndex = getKey(key);

        if (hashIndex == -1) return null;

        Item item = map[hashIndex].item;

        map[hashIndex] = null;

        SavedItem[] snapshotMap = map;

        map = new SavedItem[snapshotMap.length];

        for (SavedItem savedItem : snapshotMap) {
            if (savedItem != null) put(savedItem.key, savedItem.item);
        }

        return item;
    }

    private int hash(String key) {
        return key.length() % map.length;
    }

    private int getKey(String key) {
        int hashIndex = hash(key);

        if (map[hashIndex] != null && map[hashIndex].key.equals(key)) return hashIndex;

        int stopIndex = hashIndex;

        hashIndex = hashIndex == map.length - 1 ? 0 : hashIndex + 1;

        while (hashIndex != stopIndex && map[hashIndex] != null && !map[hashIndex].key.equals(key)) {
            hashIndex = (hashIndex + 1) % map.length;
        }

        return stopIndex == hashIndex ? -1 : hashIndex;
    }

    private boolean isTaken(int index) {
        return map[index] != null;
    }

}
