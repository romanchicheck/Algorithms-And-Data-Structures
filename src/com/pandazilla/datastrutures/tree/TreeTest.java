package com.pandazilla.datastrutures.tree;

public class TreeTest {

    public static void main(String[]args) {
        int value;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50, 1.5);
        binaryTree.insert(25, 1.2);
        binaryTree.insert(75, 1.7);
        binaryTree.insert(12, 1.5);
        binaryTree.insert(37, 1.2);
        binaryTree.insert(43, 1.7);
        binaryTree.insert(30, 1.5);
        binaryTree.insert(33, 1.2);
        binaryTree.insert(87, 1.7);
        binaryTree.insert(93, 1.5);
        binaryTree.insert(97, 1.5);
        binaryTree.displayTree();
    }
}
