package com.pandazilla.crackingthecodinginterview.chapter1;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to O.
 * Solution: http://www.lifeincode.net/programming/leetcode-set-matrix-zeroes-java/
 */

public class ZeroMatrix {

    private int[][] array;

    public ZeroMatrix(int[][] pArray) {
        this.array = pArray;
        if (checkIfArrayIsEmpty()) {
            initArray(array);
        }
    }

    public void setToZero() {
        boolean firstRowZero = false;
        boolean firstColumnZero = false;
        int m = array.length;
        int n = array[0].length;
        for (int i = 0; i < m; i++) {
            if (array[i][0] == 0) {
                firstColumnZero = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[0][i] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i][j] == 0) {
                    array[0][j] = 0;
                    array[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (array[i][0] == 0) {
                for (int j = 1; j < n; j++)
                    array[i][j] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            if (array[0][i] == 0) {
                for (int j = 1; j < m; j++)
                    array[j][i] = 0;
            }
        }
        if (firstRowZero) {
            for (int i = 0; i < n; i++)
                array[0][i] = 0;
        }
        if (firstColumnZero) {
            for (int i = 0; i < m; i++)
                array[i][0] = 0;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

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
