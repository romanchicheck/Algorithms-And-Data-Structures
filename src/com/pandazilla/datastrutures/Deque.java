package com.pandazilla.datastrutures;

public interface Deque {

    int size();

    boolean isEmpty();

    Object first();

    Object last();

    void insertFirst(Object element);

    void insertLast(Object element);

    Object removeFirst();

    Object removeLast();
}
