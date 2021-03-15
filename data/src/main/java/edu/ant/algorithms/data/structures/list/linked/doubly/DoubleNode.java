package edu.ant.algorithms.data.structures.list.linked.doubly;

import edu.ant.algorithms.data.structures.utils.Item;

public class DoubleNode {

    private Item item;
    private DoubleNode consequent;
    private DoubleNode antecedent;

    public DoubleNode(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public DoubleNode getConsequent() {
        return consequent;
    }

    public void setConsequent(DoubleNode consequent) {
        this.consequent = consequent;
    }

    public DoubleNode getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(DoubleNode antecedent) {
        this.antecedent = antecedent;
    }

    @Override
    public String toString() {
        return item.toString();
    }

}
