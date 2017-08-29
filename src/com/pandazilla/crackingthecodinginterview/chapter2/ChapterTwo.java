package com.pandazilla.crackingthecodinginterview.chapter2;

import com.pandazilla.datastrutures.Item;
import com.pandazilla.datastrutures.list.LinkedList;

public class ChapterTwo {

    public static void main(String[] args) {
        Dups dups = new Dups(initList());
        dups.removeDups();
    }

    private static LinkedList initList() {
        LinkedList<Item> linkedList = new LinkedList();
        linkedList.insertFirst(new Item(5));
        linkedList.insertFirst(new Item(7));
        linkedList.insertFirst(new Item(25));
        linkedList.insertFirst(new Item(5));
        linkedList.insertFirst(new Item(8));
        linkedList.insertFirst(new Item(7));
        linkedList.insertFirst(new Item(25));
        return linkedList;
    }
}
