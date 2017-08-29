package com.pandazilla.datastrutures.stack;

import com.pandazilla.datastrutures.exceptions.StackEmptyException;
import com.pandazilla.datastrutures.exceptions.StackFullException;

public interface Stack<T> {

    /**
     * @return the size of stack
     */
    int size();

    /**
     * check if stack is empty
     *
     * @return true if stack is empty or false if stack is not empty
     */
    boolean isEmpty();

    /**
     * check if stack is full
     * @return true if stack is full or false if not full
     */
    boolean isFull();

    /**
     * remove the last element of stack
     *
     * @return the removed element
     * @throws StackEmptyException if stack is empty
     */
    T pop() throws StackEmptyException;

    /**
     * add new element to stack
     *
     * @param element which will be added
     * @throws StackFullException if stack is overflow
     */
    void push(T element) throws StackFullException;

    /**
     * @return last element
     * @throws StackEmptyException if stack is empty
     */
    T peek() throws StackEmptyException;

}
