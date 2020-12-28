package com.learning.day11;

import java.util.Arrays;

public class VariableArgumentsDemo {
    public static void main(String[] args) {
        System.out.println("Calling a method with variable arguments");
        printMax(20, 5, 100, 60.2);
        printMax(4.8, 0.5, 1.33, 9.001);
        printMax(-4.8, -0.5, -1.33, -9.001);
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No parameters passed");
            return;
        }

        System.out.println("Parameters are: " + Arrays.toString(numbers));

        double maximumNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maximumNumber < numbers[i]) {
                maximumNumber = numbers[i];
            }
        }

        System.out.println("The maximum number is: " + maximumNumber + "\n");
    }
}
