package com.learning.day3;

public class BreakAndContinue {
    public static void main(String[] args) {
        // int numbers[] = {10,20,30,40,50};
        // int [] numbers = {10,20,30,40,50}; // Declaring and initializing the array like this can also work

        // Another way to declare and initialize the array
        int[] numbers;
        numbers = new int[]{10, 20, 30, 40, 50};

        // Using a break statement
        for (int x : numbers) {
            if (x == 30) break;
            System.out.println("Value for x is " + x);
        }

        System.out.println("\n");

        // Using a continue statement
        for (int b: numbers) {
            if (b == 30) continue;
            System.out.println("Value for b is " + b);
        }
    }
}
