package com.pandazilla.datastrutures.hash_table;

public class HashTableTest {

    public static void main(String[] args) {
        int key;
        int keyPerCell = 10;
        int size = 15;
        DataItem dataItem;
        HashTable hashTable = new HashTable(size);
        for(int i = 0; i < size; i++) {
            key = (int) (Math.random() * keyPerCell * size);
            dataItem = new DataItem(key);
            hashTable.insert(dataItem);
        }
        hashTable.displayTable();
    }
}
