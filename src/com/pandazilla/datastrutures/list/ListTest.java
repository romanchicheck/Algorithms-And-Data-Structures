package com.pandazilla.datastrutures.list;

public class ListTest {

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

    private static LinkedList<ListItem> linkedList;

    public static void main(String[] args) {
        linkedList = new LinkedList<>();
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
        linkedList.insertFirst(one);
        linkedList.insertFirst(two);
        linkedList.insertFirst(three);
        linkedList.insertFirst(four);
        linkedList.insertFirst(five);
        linkedList.insertFirst(six);
        linkedList.insertFirst(seven);
        linkedList.insertFirst(eight);
        linkedList.insertFirst(nine);
        linkedList.insertFirst(ten);
        linkedList.displayList();
        linkedList.deleteFirst();
        linkedList.displayList();
        linkedList.deleteFirst();
        linkedList.displayList();
        System.out.println(linkedList.find(ten));
        System.out.println(linkedList.find(nine));
        System.out.println(linkedList.find(seven));
        System.out.println(linkedList.find(six));
        System.out.println(linkedList.deleteByKey(six));
        linkedList.displayList();
        linkedList.deleteByKey(new ListItem(8888));
        linkedList.displayList();
        linkedList.deleteByKey(eight);
        linkedList.displayList();
        linkedList.deleteByKey(one);
        linkedList.displayList();

    }
}
