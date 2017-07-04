package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.StackEmptyException;
import com.pandazilla.datastrutures.exceptions.StackFullException;

public class LinkedStack implements Stack {

    private Node top;
    private int size;

    public LinkedStack() {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        Object temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }

    @Override
    public void push(Object element) throws StackFullException {
        Node node = new Node(top, element);
        top = node;
        size++;
    }

    @Override
    public Object top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return top.getElement();
    }
}
