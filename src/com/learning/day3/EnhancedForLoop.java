package com.learning.day3;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        String[] names = {"James", "Regina", "Kalema", "Josephine"};
        int i = 0;

        // Enhanced for loop syntax
        for (int x : numbers) {
            System.out.println("Value is " + x);
            // Trying to patch the names to the numbers
            System.out.println("Value is " + x + " and the name value is " + names[i++]);
        }
    }
}
