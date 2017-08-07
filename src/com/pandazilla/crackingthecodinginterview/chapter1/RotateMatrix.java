package com.pandazilla.crackingthecodinginterview.chapter1;

/**
 * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class RotateMatrix {

    private int[][] array;

    public RotateMatrix(int[][] pArray) {
        this.array = pArray;
        if (checkIfArrayIsEmpty()) {
            initArray(array);
        }
    }

    public void rotateMatrix() {
        int[][] rotatedArray = new int[array[0].length][array.length];
        for (int k = 0; k < array[0].length; k++) {
            for (int m = 0; m < array.length; m++) {
                rotatedArray[k][m] = array[array.length - 1 - m][k];
                System.out.print(rotatedArray[k][m] + " ");
            }
            System.out.print('\n');
        }
    }

    private boolean checkIfArrayIsEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    isEmpty = false;
                    break;
                }
            }
        }
        return isEmpty;
    }

    private void initArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j;
                System.out.print(array[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }
}
