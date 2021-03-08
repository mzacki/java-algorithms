package edu.ant.algorithms.data.structures.list.linked;

public class Node {

    private Item item;
    private Node next;

    public Node(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return item.toString();
    }

}
