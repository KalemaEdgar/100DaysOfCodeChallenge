package com.learning.day18;

class Calculation {
    int result;
    public int add(int a, int b) {
        result = a + b;
        return result;
    }
    public int subtract(int a, int b) {
        result = a - b;
        return result;
    }
}

public class MyCalculation extends Calculation {
    public void multiply(int a, int b) {
        result = a * b; // see how result was pulled in from the base class cause of Inheritance
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }

    public static void main(String[] args) {
        int a = 4, b = 10;
        MyCalculation demo = new MyCalculation();
        System.out.println("Addition of " + a + " and " + b + " is: " + demo.add(a,b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + demo.subtract(a,b));
        demo.multiply(a,b); // Cause it is not returning anything
    }
}