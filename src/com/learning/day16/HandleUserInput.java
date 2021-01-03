package com.learning.day16;

import java.util.Scanner;

// Read input from the user
// Display the input back
public class HandleUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.println("Captured Names: " + firstName + " " + lastName);
    }
}