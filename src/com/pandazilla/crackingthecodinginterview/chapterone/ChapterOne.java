package com.pandazilla.crackingthecodinginterview.chapterone;

import java.util.Scanner;

public class ChapterOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your string: ");
        String input = scanner.nextLine();
        UniqueCharAlg uniqueCharAlg = new UniqueCharAlg();
        System.out.println("Result: " + uniqueCharAlg.isUniqueChar(input));

    }
}
