package com.pandazilla.datastrutures.list;

public class FirstLastLinkedList<T> implements FLList{

    private int size = 0;
    private Node first;
    private Node last;

    public FirstLastLinkedList() {
    }

    @Override
    public Object getLast() {
        return last;
    }

    @Override
    public void insertLast(Object object) {
        Node newNode = new Node(object);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        size++;
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
    public Object getFirst() {
        return first;
    }

    @Override
    public void insertFirst(Object object) {
        Node newNode = new Node(object);
        if (isEmpty()) {
            last = newNode;
        }
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public Object deleteFirst() {
        Node temp = first;
        if (first.getNext() == null) {
            last = null;
        }
        first = first.getNext();
        size--;
        return temp;
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
                    deleteFirst();
                } else {
                    previous.setNext(current.getNext());
                    size--;
                }
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
