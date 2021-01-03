package com.learning.day16;

import java.util.Locale;
import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        double average;
        int countOfNumbers = 0, iterator = 1, sumOfNumbers = 0;

        System.out.print("Enter the input count of numbers: ");
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        countOfNumbers = input.nextInt();

        while (iterator <= countOfNumbers) {
            System.out.print("Enter number (" + iterator + "): ");
            // sumOfNumbers += input.nextInt(); // Shorthand of the below 2 statements
            int capturedNumber = input.nextInt();
            sumOfNumbers += capturedNumber;
            iterator++;
        }

        // Calculating average
        average = sumOfNumbers / (float) countOfNumbers;
        System.out.println("Average: " + average);

        //// Second implementation without a loop
        //System.out.print("Enter the first number: ");
        //int firstNumber = input.nextInt();
        //System.out.print("Enter the second number: ");
        //int secondNumber = input.nextInt();
        //System.out.print("Enter the third number: ");
        //int thirdNumber = input.nextInt();

        ////Calculating average
        //average = (firstNumber + secondNumber + thirdNumber) / 3f;
        //System.out.println("The average of " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is: " + average);
    }
}
