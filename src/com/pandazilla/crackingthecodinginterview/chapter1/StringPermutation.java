package com.pandazilla.crackingthecodinginterview.chapter1;

import java.util.Arrays;
import java.util.Stack;

/**
 * Check permutation: given two strings, write a method to decide if one is a permutation of the other.
 */
public class StringPermutation {

    public StringPermutation() {
    }

    public boolean isPermutation(String str1, String str2) {
        if (str1 != null && str2 != null) {
            if (str1 == null || str2 == null) {
                return false;
            }
            if (str1.isEmpty() || str2.isEmpty()) {
                return false;
            }
            if (str1.length() != str2.length()) {
                return false;
            }
            if (str1.equals(str2)) {
                return true;
            }
            int count1 = 0; int count2 = 0;
            for (int i = 0; i < str1.length(); i++) {
                count1+=str1.charAt(i);
                count2+=str2.charAt(i);
            }
            return count1==count2;
        }
        return false;
    }

    public boolean isPermutationReverse(String str1, String str2) {
        if (str1 != null && str2 != null) {
            if (str1 == null || str2 == null) {
                return false;
            }
            if (str1.isEmpty() || str2.isEmpty()) {
                return false;
            }
            if (str1.length() != str2.length()) {
                return false;
            }
            if (str1.equals(str2)) {
                return true;
            }
            char[] array = new char[str1.length()];
            for (int i = 0; i < str1.length(); i++) {
                array[i] = str1.charAt(str1.length() - 1 - i);
            }
            String reverse = new String(array);
            return reverse.equals(str2);
        }
        return false;
    }

    public boolean isPermutationReverseStack(String str1, String str2) {
        if (str1 != null && str2 != null) {
            if (str1 == null || str2 == null) {
                return false;
            }
            if (str1.isEmpty() || str2.isEmpty()) {
                return false;
            }
            if (str1.length() != str2.length()) {
                return false;
            }
            if (str1.equals(str2)) {
                return true;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str1.length(); i++) {
                stack.push(str1.charAt(i));
            }
            int i = 0;
            while (!stack.isEmpty() && i < str2.length()) {
                if (stack.pop().equals(str2.charAt(i))) {
                    i++;
                    continue;
                } else {
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    //Solutions from book

    private String sort(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public boolean isPermutationSort(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public boolean isPermutationCountChars(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[]letters = new int[128];
        char[]array = str1.toCharArray();
        for (char c : array) {
            letters[c]++; //count number of each char in str1
        }

        for (int i = 0; i < str2.length(); i++) {
            int c  = str2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
