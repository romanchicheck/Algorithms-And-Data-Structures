package com.pandazilla.main;

import com.pandazilla.datastrutures.ArrayQueue;

/**
 * Testing ArrayQueue
 */
public class ArrayQueueMain {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.insert(10);
        queue.insert(9);
        queue.insert(90);
        queue.insert(54);
        queue.insert(76);
        queue.insert(15);
        queue.insert(867);
        queue.insert(56);
        queue.insert(24);
        queue.insert(25);
        queue.insert(100);
        queue.printQueue();
    }
}
