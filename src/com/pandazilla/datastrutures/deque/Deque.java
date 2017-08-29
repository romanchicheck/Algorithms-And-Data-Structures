package com.pandazilla.datastrutures.deque;

import com.pandazilla.datastrutures.exceptions.DequeEmptyException;

public interface Deque {

    int size();

    boolean isEmpty();

    Object first();

    Object last() throws DequeEmptyException;

    void insertFirst(Object element);

    void insertLast(Object element);

    Object removeFirst();

    Object removeLast();
}
