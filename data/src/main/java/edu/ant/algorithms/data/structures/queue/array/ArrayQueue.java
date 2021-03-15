package edu.ant.algorithms.data.structures.queue.array;

import edu.ant.algorithms.data.structures.utils.Item;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Item[] items;
    private int frontIndex;
    private int endIndex;

    public ArrayQueue(int size) {
        items = new Item[size];
    }

    public void add(Item item) {
        // TODO consider different implementation
        // constant resizing is not the best solution
        if (endIndex == items.length) {
            Item[] resized = new Item[2 * items.length];
            System.arraycopy(items, 0, resized, 0, items.length);
            items = resized;
        }

        items[endIndex] = item;
        endIndex++;
    }

    public Item remove() {
        // consider downsizing if possible
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Item item = items[frontIndex];
        items[frontIndex] = null;
        frontIndex++;
        if (size() == 0) {
            frontIndex = 0;
            endIndex = 0;
        }

        return item;
    }

    public Item peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return items[frontIndex];
    }

    public int size() {
        return endIndex - frontIndex;
    }

}
