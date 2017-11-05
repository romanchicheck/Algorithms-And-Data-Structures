package com.pandazilla.algs;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {7556, 2, 4, 3, 100, 66, 0, 1, 99, -99};
        insertionSort(array);
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            insert(array, i, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    public static void insert(int[] array, int rightIndex, int value) {
        int i = 0;
        while (i < rightIndex && value < array[rightIndex - i - 1]) {
            array[rightIndex - i] = array[rightIndex - i - 1];
            int temp = array[rightIndex - i - 1];
            array[rightIndex - i - 1] = value;
            array[rightIndex - i] = temp;
            i++;
        }
    }

}
