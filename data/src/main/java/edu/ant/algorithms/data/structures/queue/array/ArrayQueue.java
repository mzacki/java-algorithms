package edu.ant.algorithms.data.structures.queue.array;

import edu.ant.algorithms.data.structures.utils.Item;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Item[] items;
    private int front;
    private int end;

    public ArrayQueue(int size) {
        items = new Item[size];
    }

    public void add(Item item) {
        if (end == items.length) {
            Item[] resized = new Item[2 * items.length];
            System.arraycopy(items, 0, resized, 0, items.length);
            items = resized;
        }

        items[end] = item;
        end++;
    }

    public Item remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Item item = items[front];
        items[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            end = 0;
        }

        return item;
    }

    public Item peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return items[front];
    }

    public int size() {
        return end - front;
    }

}
