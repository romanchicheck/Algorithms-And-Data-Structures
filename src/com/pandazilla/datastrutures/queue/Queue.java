package com.pandazilla.datastrutures.queue;

import com.pandazilla.datastrutures.exceptions.QueueEmptyException;

public interface Queue<T> {

    /**
     * @return the size of queue
     */
    int size();

    /**
     * check if queue is empty
     *
     * @return true if queue is empty or false if stack is not empty
     */
    boolean isEmpty();

    /**
     * check if queue is full
     *
     * @return true if queue is full or false if queue is not full
     */
    boolean isFull();

    /**
     * read first element in queue
     *
     * @return front element of queue
     * @throws QueueEmptyException if queue is empty
     */
    T front() throws QueueEmptyException;

    /**
     * adding element to end of queue
     *
     * @param element which will be added
     */
    void insert(T element);

    /**
     * remove element from queue
     *
     * @return deleted element
     * @throws QueueEmptyException if queue is empty
     */
    T remove() throws QueueEmptyException;
}
