package com.pandazilla.datastrutures.queue;

import com.pandazilla.datastrutures.exceptions.QueueEmptyException;
import com.pandazilla.datastrutures.list.LinkedList;

public class LinkedQueue<T> implements Queue {

    private int size;
    private LinkedList<T> list;

    public LinkedQueue() {
        this.list = new LinkedList<>();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

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
        list.insertLast(element);
        size++;
    }

    @Override
    public Object remove() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue is empty");
        }
        return list.deleteFirst();
    }
}
