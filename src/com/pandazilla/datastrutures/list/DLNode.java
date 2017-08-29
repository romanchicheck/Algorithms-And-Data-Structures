package com.pandazilla.datastrutures.list;

public class DLNode<T> {

    private T element;
    private DLNode<T> next, prev;

    public DLNode() {}

    public DLNode(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public DLNode<T> getNext() {
        return next;
    }

    public void setNext(DLNode<T> next) {
        this.next = next;
    }

    public DLNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DLNode<T> prev) {
        this.prev = prev;
    }
}
