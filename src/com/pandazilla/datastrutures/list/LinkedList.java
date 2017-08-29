package com.pandazilla.datastrutures.list;

public class LinkedList<T> implements List {

    private int size;
    private Node<T> first;
    private Node<T> last;

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

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    @Override
    public Node<T>  getLast() {
        return last;
    }

    @Override
    public void insertFirst(Object object) {
        Node<T> newNode = new Node(object);
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public void insertLast(Object object) {
        Node<T> newNode = new Node(object);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
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
    public Node<T> find(Node key) {
        Node<T> current = first;
        while (current != key) {
            if (current.getElement() != key.getElement() ) {
                if (current.getNext() == null) {
                    return null;
                } else {
                    current = current.getNext();
                }
            }
        }
        return current;
    }

    @Override
    public Node<T> deleteByKey(Node key) {
        Node<T> current = first;
        Node<T> previous = first;
        while (current != key) {
            if (current.getNext() == null) {
                return null;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (current == first) {
            first = first.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        return current;
    }

    public ListIterator<T> getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.println("Item: " + current.getElement().toString());
            current = first.getNext();
        }
    }
}
