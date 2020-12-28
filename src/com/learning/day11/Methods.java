package com.learning.day11;

public class Methods {
    public static void main(String[] args) {
        int minimumNumber = minimumFunction(4, 50);
        System.out.println("The minimum number is " + minimumNumber);

        methodRankPoints(400);
    }

    public static int minimumFunction(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    // Method overloading. Same function but different parameters (type and number can change)
    public static double minimumFunction(double a, double b) {
        double min;
        if (a < b)
            min = a;
        else
            min = b;

        return min;
    }

    // methodRankPoints does not return anything
    // Calling a void method must be a statement since it does not return anything
    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        } else if (points >= 122.4) {
            System.out.println("Rank:A2");
        } else {
            System.out.println("Rank:A3");
        }
    }
}
