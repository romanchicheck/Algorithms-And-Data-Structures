package com.pandazilla.datastrutures.list;

public class ListIterator<T> {

    private Node<T> current;
    private Node<T> previous;
    private LinkedList<T> list;

    public ListIterator(LinkedList list) {
        this.list = list;
        reset();
    }

    /**
     * reset list to first state
     */
    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    /**
     * check if current item is last
     *
     * @return true if current item is last
     */
    public boolean isEnd() {
        return current.getNext() == null;
    }

    /**
     * go to next item
     */
    public void nextNode() {
        previous = current;
        current = current.getNext();
    }

    public Node getCurrent() {
        return current;
    }

    public void insertAfter(Object data) {
        Node newNode = new Node(data);
        if (list.isEmpty()) {
            list.setFirst(newNode);
            current = newNode;
        } else {
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            nextNode();
        }
    }

    public void insertBefore(Object data) {
        Node newNode = new Node(data);
        if (previous == null) {
            newNode.setNext(list.getFirst());
            list.setFirst(newNode);
            reset();
        } else {
            newNode.setNext(previous.getNext());
            previous.setNext(newNode);
            current = newNode;
        }
    }

    public T deleteCurrent() {
        T data = current.getElement();
        if (previous == null) {
            list.setFirst(current.getNext());
            reset();
        } else {
            previous.setNext(current.getNext());
            if (isEnd()) {
                reset();
            } else {
                current = current.getNext();
            }
        }
        return data;
    }
}
