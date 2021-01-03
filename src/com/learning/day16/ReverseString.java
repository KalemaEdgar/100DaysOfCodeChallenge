package com.learning.day16;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String text = "This is a string";
        char[] str = text.toCharArray(); // This is an array containing the different characters
        int stringLength = str.length;

        System.out.println("Original string: " + text);
        System.out.print("Reversed string: ");
        for (int i = 1; i <= stringLength; i++) {
            System.out.print(str[stringLength - i]);
        }

        /*
         //// Second implementation
         Scanner scanner = new Scanner(System.in);
         System.out.print("Input a string: ");
         char[] letters = scanner.nextLine().toCharArray();
         System.out.print("Reverse string: ");
         for (int i = letters.length - 1; i >= 0; i--) {
             System.out.print(letters[i]);
         }
         System.out.print("\n");
        */
    }
}
