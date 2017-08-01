package com.pandazilla.crackingthecodinginterview.chapter1;

/**
 * String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller
 * than the original string, your method should return the original string. You can assume the string has only
 * uppercase and lowercase letters (a - z).
 */
public class StringCompression {

    public StringCompression() {
    }

    public String compression(String str) {
        int index = 0;
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(index) == str.charAt(i)) {
                count++;
            } else {
                stringBuilder.append(str.charAt(index)).append(count);
                index = i;
                count = 1;
            }
        }
        stringBuilder.append(String.valueOf(str.charAt(index))).append(String.valueOf(count));
        return stringBuilder.toString().length() < str.length() ? stringBuilder.toString() : str;
    }
}
