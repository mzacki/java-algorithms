package edu.ant.algorithms.data.structures.list.linked;

import edu.ant.patterns.utils.logger.LoggingService;

/**
 * It seems to be more natural impl - add first item as fixed head pointing to tail (next), then subsequent item as tail
 * pointing to null. Then another item is to replace null in the tail and becomes the tail itself.
 */

public class HeadAndTailLinkedList {

    private Node head;
    private int size;

    public void add(Item item) {
        Node node = new Node(item);
        if (size == 0) {
            head = node;
            size++;
            return;
        }

        Node tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(node);
        size++;
    }

    // removes tail of list
    public Node remove() {

        if (head == null) {
            return null;
        }

        if (head.getNext() == null) {
            Node toRemove = head;
            head = null;
            size--;
            return toRemove;
        }

        Node current = head;
        Node tail = head.getNext();
        while (tail.getNext() != null) {
            current = tail;
            tail = tail.getNext();
        }
        Node removed = tail;
        current.setNext(null);
        size--;
        return removed;
    }

    public int getSize() {
        return size;
    }

    public void log() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current);
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }
        LoggingService.logMsg(sb);
    }

}
