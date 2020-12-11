package com.learning.day3;

public class Loops {
    public static void main(String[] args) {
        int x = 20;

        // while loop syntax
        while (x < 30) {
            System.out.println("Value for x is " + x);
            x++;
        }

        // for loop syntax
        for (x = 20; x < 30; x++) {
            System.out.println("Value for x is " + x);
        }

        // do while loop syntax
        do {
            System.out.println("Value for x is " + x);
            x++;
        } while (x < 30);

        for (int a = 1; a < 4; a++) {
            switch (a) {
                case 1:
                    System.out.println(a + " - one");
                    break;
                case 2:
                    System.out.println(a + " - two");
                    break;
                case 3:
                    System.out.println(a + " - three");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }
    }
}
