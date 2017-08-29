package com.pandazilla.datastrutures.stack;

import com.pandazilla.datastrutures.list.LinkedList;
import com.pandazilla.datastrutures.exceptions.StackEmptyException;
import com.pandazilla.datastrutures.exceptions.StackFullException;

public class LinkedStack<T> implements Stack {

    private int size;
    private LinkedList<T> list;

    public LinkedStack() {
        list = new LinkedList<>();
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
    }

    @Override
    public Object pop() throws StackEmptyException {
        size--;
        return list.deleteFirst();
    }

    @Override
    public void push(Object element) throws StackFullException {
        list.insertFirst(element);
        size++;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return list.getFirst();
    }
}
