package com.pandazilla.crackingthecodinginterview.chapter1;

/**
 * Write a method to replace all spaces in a string with '%20. You may assume that the string has sufficient space
 * at the end to hold the additional characters, and that you are given the "true" length of the string.
 * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 */
public class ReplaceAllSpaces {

    public ReplaceAllSpaces() {
    }

    public String replaceAllSpaces(String str, int realSize) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < realSize; i++) {
            if (str.charAt(i) == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public String replaceAllSpacesArray(String str, int realSize) {
        String result;
        char[]array = new char[realSize];
        for (int i = 0; i < realSize; i++) {
            if (str.charAt(i) == ' ') {
                array[i] = '%';
                array[i + 1] = '2';
                array[i + 2] = '0';
            } else {
                array[i] = str.charAt(i);
            }
        }
        result = new String(array);
        return result;
    }

}
