package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.StackEmptyException;
import com.pandazilla.datastrutures.exceptions.StackFullException;

/**
 * Stack implementation based on array
 */

public class ArrayStack implements Stack {

    //capacity of array
    private int capacity;

    //array for saving stack's elements
    private Object[] elements;

    //index of last stack's element in array
    private int top = -1;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty!");
        }
        Object element = elements[top];
        elements[top--] = null; //garbage collector will remove elements[peek]
        return element;
    }

    @Override
    public void push(Object element) throws StackFullException {
        if (isFull()) {
            throw new StackFullException("Stack overflow!");
        }
        elements[++top] = element;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackFullException("Stack is empty!");
        }
        return elements[top];
    }

    public void clearStack() {
        while (!isEmpty()) {
            pop();
        }
    }

    public void printStack() {
        for (Object obj : elements) {
            System.out.print("Value: " + obj + " ");
        }
    }
}
