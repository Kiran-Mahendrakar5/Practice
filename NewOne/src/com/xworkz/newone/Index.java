package com.xworkz.newone;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scanner.nextLine();
        System.out.println("Enter an index:");
        int index = scanner.nextInt();
        if (index >= 1 && index < word.length()) {
            char character = word.charAt(index);
            System.out.println("The character at index " + index + " is: " + character);
        } else {
            System.out.println("Invalid index.");
        }
        
        scanner.close();
    }
}
