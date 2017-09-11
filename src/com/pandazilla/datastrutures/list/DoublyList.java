package com.pandazilla.datastrutures.list;

public interface DoublyList<T> extends FLList<T>{

    void insertAfterKey(T key, T data);

    /**
     * Delete last item from list
     *
     * @return node of removed item
     */
    T deleteLast();

}
