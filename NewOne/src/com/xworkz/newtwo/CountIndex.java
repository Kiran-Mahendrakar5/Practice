package com.xworkz.newtwo;

import java.util.Scanner;

public class CountIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scanner.nextLine();
        System.out.println("Enter index:");
        int index = scanner.nextInt();
        
        // Check if the index is within the valid range of the word
        if (index >= 0 && index < word.length()) {
            char character = word.charAt(index);
            System.out.println("Character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index");
        }

        scanner.close(); // close the scanner to prevent resource leak
    }
}
