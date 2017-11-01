package com.pandazilla.algs;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 3, 10, 0, 1, 99, -99};
        selectionSort(array);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                swap(array, j, indexOfSmallestArrayItem(array, j));
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    private static int indexOfSmallestArrayItem(int[] array, int startIndex) {
        int minVal = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < minVal) {
                minIndex = i;
                minVal = array[i];
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
