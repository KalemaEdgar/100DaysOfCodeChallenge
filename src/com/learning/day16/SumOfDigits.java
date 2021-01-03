package com.learning.day16;

public class SumOfDigits {
    public static void main(String[] args) {
        long digit = 14789;
        System.out.println("Sum of the digits " + digit + " is " + sumDigits(digit));
    }

    public static int sumDigits(long data) {
        int sum = 0;
        while (data != 0) {
            sum += data % 10;
            data = data / 10;
        }
        return sum;
    }
}
