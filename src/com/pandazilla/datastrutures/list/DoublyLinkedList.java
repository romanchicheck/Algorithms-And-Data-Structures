package com.pandazilla.datastrutures.list;

public class DoublyLinkedList<T> implements List {

    private int size;
    private DLNode<T> first;
    private DLNode<T> last;

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
    public Object getLast() {
        return last;
    }

    @Override
    public void insertFirst(Object object) {
        DLNode<T> newNode = new DLNode(object);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrev(newNode);
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }

    @Override
    public void insertLast(Object object) {
        DLNode<T> newNode = new DLNode(object);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        size++;
    }

    @Override
    public Object deleteFirst() {
        DLNode<T> temp = first;
        if (first.getNext() == null) {
            last = null;
        } else {
            first.getNext().setPrev(null);
        }
        first = first.getNext();
        size--;
        return temp;
    }

    public Object deleteLast() {
        DLNode<T> temp = last;
        if (first.getNext() == null) {
            first = null;
        } else {
            last.getPrev().setNext(null);
        }
        last = last.getPrev();
        return temp;
    }

    public boolean insertAfter(Object key, Object data) {
        DLNode current = first;
        while (current.getElement() != key) {
            current = current.getNext();
            if (current == null) {
                return false;
            }
        }
        DLNode newNode = new DLNode(data);
        if (current == last) {
            newNode.setNext(null);
            last = newNode;
        } else {
            newNode.setNext(current.getNext());
            current.getNext().setPrev(newNode);
        }
        newNode.setPrev(current);
        current.setNext(newNode);
        return true;
    }

    @Override
    public Object find(Node key) {
        return null;
    }

    @Override
    public DLNode deleteByKey(Node key) {
        DLNode current = first;
        while (current.getElement() != key) {
            current = current.getNext();
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.getNext();
        } else {
            current.getPrev().setNext(current.getNext());
        }
        if (current == last) {
            last = current.getPrev();
        } else {
            current.getNext().setPrev(current.getPrev());
        }
        return current;
    }
}
