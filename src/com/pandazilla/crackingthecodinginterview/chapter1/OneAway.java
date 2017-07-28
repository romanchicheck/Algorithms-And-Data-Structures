package com.pandazilla.crackingthecodinginterview.chapter1;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are one edit
 * (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class OneAway {

    public OneAway() {
    }

    public boolean isStringModified(String str1, String str2) {
        if (str1 != null && str2 != null && !str1.isEmpty() && !str2.isEmpty()) {
            return isModifiedByInsertionOrRemovingCharacter(str1.trim().toLowerCase(), str2.trim().toLowerCase())
                    || isModifiedByReplacingCharacter(str1.trim().toLowerCase(), str2.trim().toLowerCase());
        }
        return false;
    }

    private boolean isModifiedByInsertionOrRemovingCharacter(String str1, String str2) {
        return (str2.length() - str1.length() == 1 || str1.length() - str2.length() == 1) && isOneCharDifference(str1, str2);
    }

    private boolean isModifiedByReplacingCharacter(String str1, String str2) {
        int replacedCharactersCount = 0;
        if (str1.length() == str2.length() && !str1.equals(str2)) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    replacedCharactersCount++;
                }
            }
        }
        return replacedCharactersCount == 1;
    }

    private boolean isOneCharDifference(String str1, String str2) {
        int[] tableFrequency = new int[Character.getNumericValue('z') + 1];
        int countOfUniqueChars = 0;
        String concatenated = str1.concat(str2);
        for (int i = 0; i < concatenated.length(); i++) {
            int val = Character.getNumericValue(concatenated.charAt(i));
            tableFrequency[val]++;
            if (tableFrequency[val] % 2 != 0) {
                countOfUniqueChars++;
            } else {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars == 1;
    }
}
