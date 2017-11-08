package com.pandazilla.datastrutures.tree;

public class TreeTest {

    public static void main(String[]args) {
        int value;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50, 1.5);
        binarySearchTree.insert(25, 1.2);
        binarySearchTree.insert(75, 1.7);
        binarySearchTree.insert(12, 1.5);
        binarySearchTree.insert(37, 1.2);
        binarySearchTree.insert(43, 1.7);
        binarySearchTree.insert(30, 1.5);
        binarySearchTree.insert(33, 1.2);
        binarySearchTree.insert(87, 1.7);
        binarySearchTree.insert(93, 1.5);
        binarySearchTree.insert(97, 1.5);
        binarySearchTree.displayTree();
    }
}
