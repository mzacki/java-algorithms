package edu.ant.structures.collections.generic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class AbstractQueueImpl<T> extends AbstractQueue<T> {

    private LinkedList<T> items;

    public AbstractQueueImpl() {
        this.items = new LinkedList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean offer(T t) {
        return t != null && items.add(t);
    }

    @Override
    public T poll() {
        Iterator<T> iterator = items.iterator();
        T t = iterator.next();

        if (t != null) {
            iterator.remove();
            return t;
        }
        return null;
    }

    @Override
    public T peek() {
        return items.getFirst();
    }

}
