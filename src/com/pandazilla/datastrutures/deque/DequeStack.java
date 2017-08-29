package com.pandazilla.datastrutures.deque;

import com.pandazilla.datastrutures.exceptions.DequeEmptyException;
import com.pandazilla.datastrutures.exceptions.StackEmptyException;
import com.pandazilla.datastrutures.exceptions.StackFullException;
import com.pandazilla.datastrutures.stack.Stack;

public class DequeStack implements Stack {

    private Deque deque;

    public DequeStack() {
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
    public Object pop() throws StackEmptyException {
        try {
            return deque.removeLast();
        } catch (DequeEmptyException e) {
            throw new StackEmptyException("Stack is empty");
        }
    }

    @Override
    public void push(Object element) throws StackFullException {
        deque.insertLast(element);
    }

    @Override
    public Object peek() throws StackEmptyException {
        try {
            return deque.last();
        } catch (DequeEmptyException e) {
            throw new StackEmptyException("Stack is empty");
        }
    }
}
