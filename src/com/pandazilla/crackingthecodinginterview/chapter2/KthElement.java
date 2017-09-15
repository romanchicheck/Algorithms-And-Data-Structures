package com.pandazilla.crackingthecodinginterview.chapter2;

import com.pandazilla.datastrutures.Item;
import com.pandazilla.datastrutures.list.LinkedList;
import com.pandazilla.datastrutures.list.Node;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class KthElement {

    private LinkedList<Item> linkedList = new LinkedList();

    public KthElement(LinkedList<Item> linkedList) {
        this.linkedList = linkedList;
    }

    public void findKthElementToLast(int kth) {
        int i;
        if (kth <= 0 || kth > linkedList.size()) {
            System.out.println("There are no such element");
        } else {
            i = linkedList.size() - kth;
            Node current = linkedList.getFirst();
            while (i != 0) {
                current = current.getNext();
                i--;
            }
            System.out.println("The kth element is: " + current.getElement().toString());
        }
    }

}
