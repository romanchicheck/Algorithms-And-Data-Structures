package com.pandazilla.crackingthecodinginterview.chapterone;

import java.util.HashSet;

/**
 * 1.1 Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

public class UniqueCharAlg {

    public UniqueCharAlg() {
    }

    public boolean isUniqueChar(String str) {
        if (str.length() > 256) {
            return true;
        }
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (characters.add(str.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
