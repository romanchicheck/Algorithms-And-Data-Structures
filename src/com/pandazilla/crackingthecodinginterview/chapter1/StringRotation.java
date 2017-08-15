package com.pandazilla.crackingthecodinginterview.chapter1;

public class StringRotation {

    public StringRotation() {
    }

    public boolean isSubString(String rotatedStr, String existingStr) {
        if (rotatedStr.length() == existingStr.length()) {
            for (int i = 0; i < existingStr.length(); i++) {
                String str = rotatedStr.substring(i + 1) + rotatedStr.substring(0, i + 1);
                if (str.equals(existingStr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
