package com.learning.day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataWithoutAutoResourceMgt {
    public static void main(String[] args) {
        FileReader file = null;
        // Since we are not using try-with-resources syntax, we need a finally block to close the resources
        try {
            file = new FileReader("D:/testshell/sample-input1.txt");
            char[] data = new char[10];

            file.read(data); // reads the content to the array
            for (char dataItem: data) {
                System.out.print(dataItem); // prints the characters one by one
            }

        } catch (IOException exception) {
            System.out.println(exception);

        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                // System.out.println(ex.toString());
                ex.printStackTrace();
            }
        }
    }
}
