package com.pandazilla.datastrutures.tree;

public class TreeTest {

    public static void main(String[]args) {
        int value;
        Tree tree = new Tree();
        tree.insert(50, 1.5);
        tree.insert(25, 1.2);
        tree.insert(75, 1.7);
        tree.insert(12, 1.5);
        tree.insert(37, 1.2);
        tree.insert(43, 1.7);
        tree.insert(30, 1.5);
        tree.insert(33, 1.2);
        tree.insert(87, 1.7);
        tree.insert(93, 1.5);
        tree.insert(97, 1.5);
        tree.displayTree();
    }
}
