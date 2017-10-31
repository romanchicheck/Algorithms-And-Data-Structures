package com.pandazilla.crackingthecodinginterview.chapter2;

import com.pandazilla.datastrutures.Item;
import com.pandazilla.datastrutures.list.LinkedList;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node,
 * not necessarily the exact middle) of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a -> b -> c -> d -> e-> f
 * Result: nothing is returned, but the new linked list looks like a -> b -> d -> e -> f
 */
public class DeleteMiddleNode {

    private LinkedList<Item> linkedList = new LinkedList();

    public DeleteMiddleNode(LinkedList<Item> linkedList) {
        this.linkedList = linkedList;
    }

    public void deleteAnyNode(Item key) {
        linkedList.displayList();
        linkedList.deleteByKey(key);
        linkedList.displayList();
    }
}
