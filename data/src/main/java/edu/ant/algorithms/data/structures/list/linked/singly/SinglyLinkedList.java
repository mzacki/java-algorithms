package edu.ant.algorithms.data.structures.list.linked.singly;

import edu.ant.algorithms.data.structures.list.linked.Item;
import edu.ant.patterns.utils.logger.LoggingService;

/**
 * This impl adds new item as a new head of the list.
 * Insertion: O(1) - no need to traverse the list
 * Previously added items are shifted to further positions.
 * Git commit-like style.
 * */

public class SinglyLinkedList {

    private Node head;
    private int size;

    public void add(Item item) {
        Node node = new Node(item);
        node.setNext(head);
        head = node;
        size++;
    }

    // removes head
    public Node remove() {
        if (head == null) {
            return null;
        }
        Node toRemove = head;
        head = head.getNext();
        toRemove.setNext(null);
        size--;
        return toRemove;
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
