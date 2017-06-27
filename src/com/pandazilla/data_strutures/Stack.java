package com.pandazilla.data_strutures;

import com.pandazilla.data_strutures.exceptions.StackEmptyException;

public interface Stack {

    int size();

    boolean isEmpty();

    void pop() throws StackEmptyException;

    void push(Object element);

    Object top() throws StackEmptyException;

}
