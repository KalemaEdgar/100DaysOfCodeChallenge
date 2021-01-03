package com.learning.day16;

import java.util.Scanner;

public class NumericOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Result of " + firstNumber + " + " + secondNumber + " is: " + (firstNumber + secondNumber));
        System.out.println("Adding " + firstNumber + " + " + secondNumber + " yields: " + result);

        System.out.println("Division of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber / secondNumber));
        System.out.println("Product of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber * secondNumber));
        System.out.println("Remainer or modulus between " + firstNumber + " and " + secondNumber + " is: " + (firstNumber % secondNumber));

        // Second exercise on Numerics
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
}
