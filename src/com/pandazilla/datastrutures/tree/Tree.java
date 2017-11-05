package com.pandazilla.datastrutures.tree;

public class Tree {

    private Node root;

    public Tree() {
    }

    public void insert(int id, double data) {
        Node node = new Node();
        node.setKey(id);
        node.setData(data);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if (id < current.getKey()) { //move on left?
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(node);
                        return;
                    }
                } else { //move on right?
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(node);
                        return;
                    }
                }
            }
        }
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
