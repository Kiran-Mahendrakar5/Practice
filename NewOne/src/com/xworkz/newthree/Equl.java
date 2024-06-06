package com.xworkz.newthree;

import java.util.Arrays;

public class Equl {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Check if the arrays are equal
        boolean arraysEqual = Arrays.equals(array1, array2);

        // Output the result
        System.out.println("Arrays are equal: " + arraysEqual);
    }
}
