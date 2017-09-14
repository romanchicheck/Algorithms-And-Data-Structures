package com.pandazilla.datastrutures.list;

public class LinkedList<T> implements List {

    private int size;
    private Node<T> first;

    public LinkedList() {
    }


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
        Node newNode = new Node(object);
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public Object deleteFirst() {
        Node removedItem = first;
        first = first.getNext();
        size--;
        return removedItem;
    }

    @Override
    public boolean find(Object key) {
        Node current = first;
        while (current != null) {
            if (current.getElement().equals(key)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Object deleteByKey(Object key) {
        Node current = first;
        Node previous = first;
        while (current != null) {
            if (current.getElement().equals(key)) {
                if (current == first) {
                    first = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                return key;
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.print("|" + current.getElement().toString());
            current = current.getNext();
        }
        System.out.print("|" + '\n' + "Size is: " + size);
        System.out.println('\n');
    }
}
