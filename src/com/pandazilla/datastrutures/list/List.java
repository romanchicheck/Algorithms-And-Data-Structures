package com.pandazilla.datastrutures.list;

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
     * Get last node
     * @return Node
     */
    T getLast();

    /**
     * Add an item to list
     *
     * @param object
     */
    void insertFirst(T object);


    /**
     * Add an item to list
     *
     * @param object
     */
    void insertLast(T object);

    /**
     * Delete item from list
     *
     * @return node of removed item
     */
    T deleteFirst();

    /**
     * Find item in list by key
     * @param key of item
     * @return item which was found
     */
    T find(Node<T> key);

    /**
     * Delete item by key
     * @param key of item
     * @return deleted item
     */
    T deleteByKey(Node<T> key);

}
