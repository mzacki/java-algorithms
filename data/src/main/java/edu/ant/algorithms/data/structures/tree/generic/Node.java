package edu.ant.algorithms.data.structures.tree.generic;

public class Node<K extends Comparable<K>, V> {

    private final K key;
    private final V value;

    private Node<K, V> rightChild;
    private Node<K, V> leftChild;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Node<K, V> getRightChild() {
        return rightChild;
    }

    public Node<K, V> getLeftChild() {
        return leftChild;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setRightChild(Node<K, V> rightChild) {
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node<K, V> leftChild) {
        this.leftChild = leftChild;
    }

}
