package com.learning.day14;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataWithAutoResourceMgt {
    public static void main(String[] args) {
        // called try-with-resources statement
        // try-with-resources, referred as automatic resource management automatically closes the resources used within the try catch block.
        // no need for a finally block to close resources
        try (FileReader file = new FileReader("D:/testshell/sample-input1.txt")) {

            char[] data = new char[15];

            file.read(data); // reads the content to the array
            for (char dataItem: data) {
                System.out.print(dataItem); // prints the characters one by one
            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
}
