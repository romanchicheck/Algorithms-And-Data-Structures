package com.pandazilla.datastrutures;

public interface List<T> {

    /**
     * Check if list is empty
     *
     * @return true if list is empty or false if list is not empty
     */
    boolean isEmpty();

    /**
     * Size of list
     * @return size of list
     */
    int size();

    /**
     * Get first node
     * @return Node
     */
    T getFirst();

    /**
     * Add an item to list
     *
     * @param object
     */
    void insertFirst(T object);

    /**
     * Delete item from list
     *
     * @return node of removed item
     */
    T deleteFirst();

    /**
     * Display list items
     */
    void displayList();

}
