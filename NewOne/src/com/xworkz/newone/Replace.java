package com.xworkz.newone;

public class Replace {
    public static void main(String[] args) {
        String original = "kiran mahendrakar";
        String oldSubstring = "kiran";
        String newSubstring = "Kishan";

        // Replace the old substring with the new one
        String modified = original.replace(oldSubstring, newSubstring);

        // Print the original and modified strings
        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
    }
}
