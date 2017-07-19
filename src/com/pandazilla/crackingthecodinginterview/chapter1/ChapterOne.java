package com.pandazilla.crackingthecodinginterview.chapter1;

import java.util.Scanner;

public class ChapterOne {

    public static void main(String[] args) {
        testUniqueCharAlg();
        testStringPermutation();
    }

    public static void testUniqueCharAlg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your string: ");
        String input = scanner.nextLine();
        UniqueCharAlg uniqueCharAlg = new UniqueCharAlg();
        System.out.println("Result: " + uniqueCharAlg.isUniqueChar(input));
    }

    public static void testStringPermutation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Input your second string: ");
        String str2 = scanner.nextLine();
        StringPermutation permutation = new StringPermutation();
        System.out.println("Result: " + permutation.isPermutation(str1, str2));
    }
}
