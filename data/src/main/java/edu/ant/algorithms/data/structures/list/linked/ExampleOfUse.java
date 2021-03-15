package edu.ant.algorithms.data.structures.list.linked;

import edu.ant.algorithms.data.structures.list.linked.doubly.DoublyLinkedList;
import edu.ant.algorithms.data.structures.list.linked.singly.HeadAndTailLinkedList;
import edu.ant.algorithms.data.structures.list.linked.singly.SinglyLinkedList;
import edu.ant.algorithms.data.structures.utils.Item;

public class ExampleOfUse {

    public static void main(String[] args) {
        Item item1 = new Item(1L, "item one");
        Item item2 = new Item(2L, "item two");
        Item item3 = new Item(3L, "item three");
        Item item4 = new Item(4L, "item four");

        SinglyLinkedList list = new SinglyLinkedList();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);

        list.log();
        list.remove();
        list.log();

        HeadAndTailLinkedList headAndTailLinkedList = new HeadAndTailLinkedList();
        headAndTailLinkedList.add(item1);
        headAndTailLinkedList.add(item2);
        headAndTailLinkedList.add(item3);
        headAndTailLinkedList.add(item4);

        headAndTailLinkedList.log();
        headAndTailLinkedList.remove();
        headAndTailLinkedList.log();

        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.addHead(item1);
        list2.addHead(item2);
        list2.addHead(item3);
        list2.addHead(item4);

        list2.log();

        list2.removeHead();
        list2.addTail(item4);

        list2.log();
    }

}
