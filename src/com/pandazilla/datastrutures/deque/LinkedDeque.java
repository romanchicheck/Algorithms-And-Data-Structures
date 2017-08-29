package com.pandazilla.datastrutures.deque;

import com.pandazilla.datastrutures.exceptions.DequeEmptyException;
import com.pandazilla.datastrutures.list.DLNode;

public class LinkedDeque implements Deque {

    private int size;
    private DLNode header, trailer;

    public LinkedDeque() {
        header = new DLNode();
        trailer = new DLNode();
        header.setNext(trailer);
        trailer.setPrev(header);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() { //TODO implement it
        return false;
    }

    @Override
    public Object first() {
        if (isEmpty()) {
            throw new DequeEmptyException("Deque is empty");
        }
        return header.getNext().getElement();
    }

    @Override
    public Object last() { //TODO implement it
        return null;
    }

    @Override
    public void insertFirst(Object element) {
        DLNode second = header.getNext();
        DLNode first = new DLNode(element);
        first.setPrev(header);
        first.setNext(second);
        second.setPrev(first);
        header.setNext(first);
        size++;
    }

    @Override
    public void insertLast(Object element) {

    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()) {
            throw new DequeEmptyException("Deque is empty");
        }
        DLNode last = trailer.getPrev();
        Object element = last.getElement();
        DLNode secondToLast = last.getPrev();
        trailer.setPrev(secondToLast);
        secondToLast.setNext(trailer);
        size--;
        return element;
    }
}
