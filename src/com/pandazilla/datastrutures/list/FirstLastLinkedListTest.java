package com.pandazilla.datastrutures.list;

public class FirstLastLinkedListTest {

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

    private static FirstLastLinkedList<ListItem> firstLastLinkedList = new FirstLastLinkedList<>();

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
        firstLastLinkedList.insertFirst(one);
        firstLastLinkedList.insertFirst(two);
        firstLastLinkedList.insertLast(three);
        firstLastLinkedList.insertFirst(six);
        firstLastLinkedList.insertLast(eight);
        firstLastLinkedList.insertFirst(five);
        firstLastLinkedList.insertFirst(seven);
        firstLastLinkedList.displayList();
        firstLastLinkedList.deleteFirst();
        firstLastLinkedList.displayList();
        System.out.println(firstLastLinkedList.deleteByKey(five));
        System.out.println(firstLastLinkedList.find(seven));
    }
}
