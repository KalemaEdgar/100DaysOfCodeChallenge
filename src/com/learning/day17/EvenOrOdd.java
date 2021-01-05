package com.learning.day17;

import java.util.Locale;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
