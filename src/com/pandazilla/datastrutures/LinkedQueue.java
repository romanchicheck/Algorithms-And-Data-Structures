package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.QueueEmptyException;

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
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object front() throws QueueEmptyException {
        return null;
    }

    @Override
    public void enqueue(Object element) {
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
    public Object dequeue() throws QueueEmptyException {
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
