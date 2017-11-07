package com.pandazilla.datastrutures.hash_table;

public class HashTable {

    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int arraySize) {
        this.arraySize = arraySize;
        this.hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); //key of deleted item
    }

    public void displayTable() {
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.print(hashArray[i].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println(" ");
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }
}
