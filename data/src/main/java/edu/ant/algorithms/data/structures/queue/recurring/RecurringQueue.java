package edu.ant.algorithms.data.structures.queue.recurring;

import java.util.NoSuchElementException;

public class RecurringQueue {

    private Recurrable[] queue;

    public RecurringQueue() {
        this.queue = new Recurrable[0];
    }

    public RecurringQueue(Recurrable[] items) {
        this.queue = new Recurrable[items.length];
        System.arraycopy(items, 0, queue, 0, queue.length);
    }

    // iterator
    // TODO to be implemented if needed
    // TODO or use array iterator implementation

    public int size() {
        return queue.length;
    }

    public boolean offer(Recurrable item) {
        if (item == null) {
            return false;
        }
        Recurrable[] resizedQueue = resize(1);
        System.arraycopy(queue, 0, resizedQueue, 0, queue.length);
        resizedQueue[resizedQueue.length - 1] = item;
        queue = resizedQueue;
        return true;
    }

    public Recurrable peek() {
        return queue.length > 0 ? queue[0] : null;
    }

    public Recurrable poll() {
        if (queue.length == 0) {
            throw new NoSuchElementException();
        }
        return queue[0].isReccuring() ? pollRecurring() : pollNonRecurring();
    }

    private Recurrable pollRecurring() {
        Recurrable first = queue[0];

        if (queue.length > 1) {
            Recurrable[] newQueue = resize(0);
            System.arraycopy(queue, 1, newQueue, 0, newQueue.length - 1);
            newQueue[newQueue.length - 1] = first;
            queue = newQueue;
        }

        return first;
    }

    private Recurrable pollNonRecurring() {
        Recurrable first = queue[0];
        Recurrable[] resizedQueue = resize(-1);

        if (queue.length > 1) {
            System.arraycopy(queue, 1, resizedQueue, 0, resizedQueue.length);
        }

        queue = resizedQueue;
        return first;
    }

    private Recurrable[] resize(int size) {
        return new Recurrable[queue.length + size];
    }

}
