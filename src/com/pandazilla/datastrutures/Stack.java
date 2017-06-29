package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.StackEmptyException;
import com.pandazilla.datastrutures.exceptions.StackFullException;

public interface Stack {

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
     * remove the last element of stack
     *
     * @return the removed element
     * @throws StackEmptyException if stack is empty
     */
    Object pop() throws StackEmptyException;

    /**
     * add new element to stack
     *
     * @param element which will be added
     * @throws StackFullException if stack is overflow
     */
    void push(Object element) throws StackFullException;

    /**
     * @return last element
     * @throws StackEmptyException if stack is empty
     */
    Object top() throws StackEmptyException;

}
