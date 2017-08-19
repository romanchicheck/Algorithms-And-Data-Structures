package com.pandazilla.datastrutures;

public class LinkedList<T> implements List{

    private int size;
    private Node<T> first;

    public LinkedList() {}

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Node<T> getFirst() {
        return first;
    }

    @Override
    public void insertFirst(Object object) {
        Node<T> newNode = new Node(first, object);
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public Node deleteFirst() {
        Node temp = first;
        first = first.getNext();
        size--;
        return temp;
    }

    @Override
    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.println("Item: " + current.getElement().toString());
            current = first.getNext();
        }
    }
}
