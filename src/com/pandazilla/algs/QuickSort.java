package com.pandazilla.algs;

import java.util.Random;

public class QuickSort {

    public static int ARRAY_LENGTH = 30;
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        printArray();
    }

    public static void initArray() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int pivot = (i + j) / 2;
        while (i < j) {
            while (i < pivot && (array[i] <= array[pivot])) {
                i++;
            }
            while (j > pivot && (array[pivot] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == pivot)
                    pivot = j;
                else if (j == pivot)
                    pivot = i;
            }
        }
        doSort(start, pivot);
        doSort(pivot+1, end);
    }

}
