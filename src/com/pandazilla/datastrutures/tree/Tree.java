package com.pandazilla.datastrutures.tree;

public class Tree {

    private Node root;

    public Tree() {
    }

    public void insert(int id, double data) {

    }

    public Node find(int key) {
        Node current = root;
        while(current.getData() != key) {
            if (key < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void delete(int id) {

    }
}
