package com.pandazilla.crackingthecodinginterview.chapter2;

import com.pandazilla.datastrutures.Item;
import com.pandazilla.datastrutures.list.LinkedList;

import java.util.List;

public class ChapterTwo {

    private static Item one, two, three, four, five, six, seven;

    public static void main(String[] args) {
        //removedups();
        //findKthToLast();
        deleteAnyNode();
    }

    public static void removedups() {
        Dups dups = new Dups(initList());
        dups.removeDups();
    }

    public static void findKthToLast() {
        KthElement element = new KthElement(initList());
        element.findKthElementToLast(4);
    }

    public static void deleteAnyNode() {
        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode(initList());
        deleteMiddleNode.deleteAnyNode(seven);
    }

    private static LinkedList initList() {
        LinkedList<Item> linkedList = new LinkedList();
        one = new Item(5);
        two = new Item(7);
        three = new Item(25);
        four = new Item(5);
        five = new Item(8);
        six = new Item(7);
        seven = new Item(25);
        linkedList.insertFirst(one);
        linkedList.insertFirst(two);
        linkedList.insertFirst(three);
        linkedList.insertFirst(four);
        linkedList.insertFirst(five);
        linkedList.insertFirst(six);
        linkedList.insertFirst(seven);
        return linkedList;
    }
}
