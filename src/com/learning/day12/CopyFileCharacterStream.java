package com.learning.day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            long start = System.currentTimeMillis();
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c; // Will be used to mark if the file still has contents to be read or not

            // This do-while will work if the file has some data in it.
            // The while loop below is better cause it factors in that the start of the read could be the end of the file
            //do {
            //    c = in.read(); // read() returns an int (next byte of data) and -1 if its the end of the file
            //    out.write(c);
            //} while (c != -1);

            // while-loop to read the file and write the contents to another
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            long end = System.currentTimeMillis();
            long elapsedTime = end - start;
            System.out.println("Elapsed time using a CharacterStream is: " + elapsedTime);

        } finally {
            // finally block always executes, irrespective of occurrence of an Exception.
            // Using a finally block allows you to run any cleanup-type statements, no matter what happens in the try/catch block.
            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
}
