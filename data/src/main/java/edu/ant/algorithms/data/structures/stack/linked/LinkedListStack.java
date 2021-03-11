package edu.ant.algorithms.data.structures.stack.linked;

import edu.ant.patterns.utils.logger.LoggingService;
import java.util.LinkedList;

public class LinkedListStack<T> {

    private final LinkedList<T> items;

    public LinkedListStack() {
        items = new LinkedList<>();
    }

    public void push(T item) {
        items.push(item);
    }

    public T pop() {
        return items.pop();
    }

    public T peek() {
        return items.peek();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void log() {
        for (T item : items) {
            LoggingService.logMsg(item);
        }
    }

}
