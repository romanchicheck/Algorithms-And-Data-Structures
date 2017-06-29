package com.pandazilla.datastrutures;

import com.pandazilla.datastrutures.exceptions.QueueEmptyException;

public interface Queue {

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
     * check first element in queue
     *
     * @return front element of queue
     * @throws QueueEmptyException if queue is empty
     */
    Object front() throws QueueEmptyException;

    /**
     * adding element to end of queue
     *
     * @param element which will be added
     */
    void enqueue(Object element);

    /**
     * remove element from queue
     *
     * @return deleted element
     * @throws QueueEmptyException if queue is empty
     */
    Object dequeue() throws QueueEmptyException;
}
