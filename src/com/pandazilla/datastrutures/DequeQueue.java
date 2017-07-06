package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.DequeEmptyException;
import com.pandazilla.datastrutures.exceptions.QueueEmptyException;

public class DequeQueue implements Queue {

    private Deque deque;

    public DequeQueue() {
        deque = new LinkedDeque();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object front() throws QueueEmptyException {
        try {
            return deque.first();
        } catch (DequeEmptyException e) {
            throw new QueueEmptyException("Queue is empty");
        }

    }

    @Override
    public void enqueue(Object element) {
        deque.insertFirst(element);
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        try {
            return deque.removeFirst();
        } catch (DequeEmptyException e) {
            throw new QueueEmptyException("Queue is empty");
        }
    }
}
