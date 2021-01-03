package com.learning.day16;

import java.util.Scanner;

public class MultiplicationTableDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int desiredNumber = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(desiredNumber + " * " + i + " = " + (desiredNumber * i));
        }
    }
}
