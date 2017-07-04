package com.pandazilla.datastrutures;

public class DLNode {

    private Object element;
    private DLNode next, prev;

    public DLNode(Object element, DLNode next, DLNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public DLNode getPrev() {
        return prev;
    }

    public void setPrev(DLNode prev) {
        this.prev = prev;
    }
}
