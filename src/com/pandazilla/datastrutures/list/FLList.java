package com.pandazilla.datastrutures.list;

public interface FLList<T> extends List<T>{

    /**
     * Get last node
     * @return Node
     */
    T getLast();

    /**
     * Add an item to list
     *
     * @param object
     */
    void insertLast(T object);

}
