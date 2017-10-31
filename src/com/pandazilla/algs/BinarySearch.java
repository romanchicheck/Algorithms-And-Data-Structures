package com.pandazilla.algs;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        binarySearch(89, array);
    }

    /**
     * Implementation of binary search algorithm.
     *
     * @param targetValue which we need to find
     * @param array       where we make searching; the array should be sorted
     * @return Returns either the index of the location in the array, or -1 if the array did not contain the targetValue
     */
    private static int binarySearch(int targetValue, int[] array) {
        if (array.length == 0) {
            System.out.println("Error! The array is empty!");
            return -1;
        }
        int min = 0;
        int max = array.length - 1;
        while (max >= min) {
            int guess = (max + min) / 2;

            if (array[guess] == targetValue) {
                System.out.println("The index is: " + guess);
                return guess;
            }

            if (array[guess] < targetValue) {
                min = guess + 1;
            }

            if (array[guess] > targetValue) {
                max = guess - 1;
            }
        }
        System.out.println("The index was not found");
        return -1;
    }

}