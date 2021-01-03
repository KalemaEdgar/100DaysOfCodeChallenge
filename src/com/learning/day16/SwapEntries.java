package com.learning.day16;

public class SwapEntries {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("Before swapping");
        System.out.println("First name is '" + firstName + "' and last name is '" + lastName + "'");
        String holder = firstName;
        firstName = lastName;
        lastName = holder;
        System.out.println("After swapping");
        System.out.println("First name is '" + firstName + "' and last name is '" + lastName + "'");
    }
}
