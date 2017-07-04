package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.QueueEmptyException;
import com.pandazilla.datastrutures.exceptions.QueueFullException;

public class ArrayQueue implements Queue {

    private int capacity;

    private Object[] elements;

    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    @Override
    public int size() {
        return (capacity - front + rear) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        if (rear == capacity - 1) {
            return true;
        } else
            return false;

    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("The Queue is empty");
        }
        return elements[front];
    }

    @Override
    public void enqueue(Object element) {
        if (size() == capacity - 1) {
            throw new QueueFullException("The queue is full!");
        }
        elements[rear] = element;
        rear = (rear + 1) % capacity;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("The Queue is empty");
        }
        Object temp = elements[front];
        elements[front] = null;
        front = (front + 1) % capacity;
        return temp;
    }
}
