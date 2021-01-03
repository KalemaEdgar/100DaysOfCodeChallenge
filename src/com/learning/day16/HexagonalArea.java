package com.learning.day16;

import java.util.Locale;
import java.util.Scanner;

public class HexagonalArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Input the number of sides on the polygon: ");
        int sides = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        int length = input.nextInt();

        //double area = (sides * (length * length)) / (4.0 * Math.tan((Math.PI / length)));
        double area = (sides * Math.pow(length, 2)) / (4.0 * Math.tan(Math.PI / sides));
        System.out.println(area);
        //Area of a polygon = (n*s^2)/(4*tan(π/n))
    }
}
