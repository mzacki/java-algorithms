package edu.ant.algorithms.data.structures.queue.circular;

import edu.ant.algorithms.data.structures.utils.Item;
import java.util.NoSuchElementException;

/**
 * AKA ring buffer, circular buffer
 * for example: keyboard buffer
 * Part of methods in Queue interface throw exceptions,
 * others return null in case of fail
 * see for example: remove() vs poll()
 * */


public class CircularQueue {

    private Item[] queue;
    private int frontIndex;
    private int endIndex;

    public CircularQueue(int size) {
        queue = new Item[size];
    }

    public void add(Item item) {
        if (size() == queue.length - 1) {
            int itemsCount = size();
            Item[] resized = new Item[2 * queue.length];

            System.arraycopy(queue, frontIndex, resized, 0, queue.length - frontIndex);
            System.arraycopy(queue, 0, resized, queue.length - frontIndex, endIndex);

            queue = resized;

            frontIndex = 0;
            endIndex = itemsCount;
        }

        queue[endIndex] = item;
        if (endIndex < queue.length - 1) {
            endIndex++;
        }
        else {
            endIndex = 0;
        }
    }

    public Item remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Item item = queue[frontIndex];
        queue[frontIndex] = null;
        frontIndex++;
        if (size() == 0) {
            frontIndex = 0;
            endIndex = 0;
        }
        else if (frontIndex == queue.length) {
            frontIndex = 0;
        }

        return item;
    }

    public Item peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[frontIndex];
    }

    public int size() {
        if (frontIndex <= endIndex) {
            return endIndex - frontIndex;
        } else {
            return endIndex - frontIndex + queue.length;
        }
    }

}
