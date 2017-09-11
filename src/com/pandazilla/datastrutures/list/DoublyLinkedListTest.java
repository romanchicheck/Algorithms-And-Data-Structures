package com.pandazilla.datastrutures.list;

public class DoublyLinkedListTest {

    static class ListItem {
        private int data;

        public ListItem(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

    private static DoublyLinkedList<ListItem> listItemDoublyLinkedList = new DoublyLinkedList<>();

    public static void main(String[] args) {
        ListItem one = new ListItem(25);
        ListItem two = new ListItem(7);
        ListItem three = new ListItem(5);
        ListItem four = new ListItem(48);
        ListItem five = new ListItem(3);
        ListItem six = new ListItem(34);
        ListItem seven = new ListItem(984);
        ListItem eight = new ListItem(2);
        ListItem nine = new ListItem(124);
        ListItem ten = new ListItem(77);

        listItemDoublyLinkedList.insertFirst(one);
        listItemDoublyLinkedList.insertFirst(two);
        listItemDoublyLinkedList.insertFirst(seven);
        listItemDoublyLinkedList.insertLast(eight);
        listItemDoublyLinkedList.insertLast(nine);
        listItemDoublyLinkedList.insertFirst(three);
        listItemDoublyLinkedList.insertFirst(four);
        listItemDoublyLinkedList.insertLast(ten);
        listItemDoublyLinkedList.insertLast(five);
        listItemDoublyLinkedList.insertFirst(six);
        listItemDoublyLinkedList.displayList();
        listItemDoublyLinkedList.displayListFromEnd();

        System.out.println("---------------------------------------------------------------------------");

        System.out.println(listItemDoublyLinkedList.find(ten));
        System.out.println(listItemDoublyLinkedList.find("key"));
        System.out.println(listItemDoublyLinkedList.find(new ListItem(56)));

        System.out.println("---------------------------------------------------------------------------");

        System.out.println(listItemDoublyLinkedList.deleteByKey(ten));
        listItemDoublyLinkedList.displayList();
        listItemDoublyLinkedList.displayListFromEnd();

        System.out.println("---------------------------------------------------------------------------");

        listItemDoublyLinkedList.insertAfterKey(six, new ListItem(112));
        listItemDoublyLinkedList.insertAfterKey(five, new ListItem(111));
        listItemDoublyLinkedList.insertAfterKey(two, new ListItem(114));
        listItemDoublyLinkedList.displayList();
        listItemDoublyLinkedList.displayListFromEnd();

        System.out.println("---------------------------------------------------------------------------");

        listItemDoublyLinkedList.deleteFirst();
        listItemDoublyLinkedList.deleteLast();
        listItemDoublyLinkedList.displayList();
        listItemDoublyLinkedList.displayListFromEnd();

        System.out.println("---------------------------------------------------------------------------");
    }
}
