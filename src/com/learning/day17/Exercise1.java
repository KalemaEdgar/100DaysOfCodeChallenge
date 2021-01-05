package com.learning.day17;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int num = input.nextInt();

        int secondNum = Integer.parseInt("" + num + num);
        int thirdNum = Integer.parseInt("" + num + num + num);
        System.out.println(num + secondNum + thirdNum);

        // Display the format the numbers are added in
        System.out.printf("%d + %d%d + %d%d%d\n", num,  num, num, num, num, num);
    }
}
