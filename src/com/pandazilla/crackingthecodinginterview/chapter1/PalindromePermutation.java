package com.pandazilla.crackingthecodinginterview.chapter1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa  atac cata
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 */
public class PalindromePermutation {

    public PalindromePermutation() {
    }

    /**
     * We should check if we can build a palindrome from input string
     * If at most 1 unique character occurs a non-multiple-of-2 times in the input,
     * the output is True otherwise the output is False
     * @param input
     * @return true if we can build a palindrome, false - if we can't
     */
    public boolean isPalindromePermutation(String input) {
        String str = input.replace(" ", "").toLowerCase();
        int size = Character.getNumericValue('z') + 1;
        int[]tableFreq = new int[size];
        int countUniqueSymbol = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = Character.getNumericValue(str.charAt(i));
            tableFreq[val]++;
            if (tableFreq[val] % 2 != 0) {
                countUniqueSymbol++;
            } else {
                countUniqueSymbol--;
            }
        }
        return countUniqueSymbol <= 1;
    }

    public boolean isPalindromePermutationHash(String input) {
        Set<Character> oddLetters = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!oddLetters.remove(c)) {
                oddLetters.add(c);
            }
        }
        return oddLetters.size() <= 1;
    }


}
