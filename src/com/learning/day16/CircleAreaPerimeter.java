package com.learning.day16;

import java.util.Locale;
import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {

        // System.out.println(Locale.getDefault());

        // Pick input from the user
        System.out.print("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The perimeter of a circle with radius " + radius + " is " + perimeter);
    }
}