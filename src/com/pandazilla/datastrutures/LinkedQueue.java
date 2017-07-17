package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.QueueEmptyException;
import com.sun.xml.internal.bind.v2.TODO;

public class LinkedQueue implements Queue{

    private int size;
    private Node head;
    private Node tail;

    public LinkedQueue() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    } //TODO implement it

    @Override
    public boolean isFull() {
        return false;
    } //TODO implement it

    @Override
    public Object front() throws QueueEmptyException { //TODO implement it
        return null;
    }

    @Override
    public void insert(Object element) {
        Node node = new Node(null, element);
        if (size == 0) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    @Override
    public Object remove() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue is empty");
        }
        Object element = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return element;
    }
}
