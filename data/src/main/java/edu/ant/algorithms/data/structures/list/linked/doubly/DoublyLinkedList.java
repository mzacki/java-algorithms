package edu.ant.algorithms.data.structures.list.linked.doubly;

import edu.ant.algorithms.data.structures.list.linked.Item;
import edu.ant.patterns.utils.logger.LoggingService;

/**
 * Head and tail insertion: O(1)
 * */

public class DoublyLinkedList {

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public void addHead(Item item) {

        DoubleNode node = new DoubleNode(item);

        if (head == null) {
            tail = node;
        } else {
            head.setAntecedent(node);
            node.setConsequent(head);
        }

        head = node;
        size++;
    }

    public void addTail(Item item) {

        DoubleNode node = new DoubleNode(item);

        if (tail == null) {
            head = node;
        } else {
            tail.setConsequent(node);
            node.setAntecedent(tail);
        }

        tail = node;
        size++;
    }

    public DoubleNode removeHead() {

        if (head == null) {
            return null;
        }

        DoubleNode toRemove = head;

        if (head.getConsequent() == null) {
            tail = null;
        } else {
            head.getConsequent().setAntecedent(null);
        }

        head = head.getConsequent();
        toRemove.setConsequent(null);
        size--;

        return toRemove;
    }

    public DoubleNode removeTail() {

        if (head == null) {
            return null;
        }

        DoubleNode toRemove = tail;

        if (tail.getAntecedent() == null) {
            head = null;
        } else {
            tail.getAntecedent().setConsequent(null);
        }

        tail = tail.getAntecedent();
        toRemove.setAntecedent(null);
        size--;

        return toRemove;
    }

    public int getSize() {
        return size;
    }

    public void log() {
        StringBuilder sb = new StringBuilder();
        DoubleNode current = head;
        while (current != null) {
            sb.append(current);
            if (current.getConsequent() != null) {
                sb.append(" <-> ");
            }
            current = current.getConsequent();
        }
        LoggingService.logMsg(sb);
    }

}
