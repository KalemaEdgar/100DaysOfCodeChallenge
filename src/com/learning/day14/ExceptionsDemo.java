package com.learning.day14;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        int[] items = new int[2];
        try {
            System.out.println(items[3]);

            FileInputStream file = new FileInputStream("filename.txt");
            byte x = (byte) file.read();

        } catch (ArrayIndexOutOfBoundsException | IOException ex) { // Handling multiple exceptions in the same catch block
            System.out.println("Exception thrown: " + ex.toString());
            // System.out.println("Exception thrown: " + ex); // gives the same as above
        } finally {
            System.out.println("The finally statement has been invoked");
            items[1] = 4;
            System.out.println("Second element value: " + items[1]);
            System.out.println("The finally statement is executed");
        }

        System.out.println("This statement is out of the try/catch block");
    }
}
