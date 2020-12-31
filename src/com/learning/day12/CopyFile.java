package com.learning.day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            /*
             - The input file needs to be under D:\Installations\xampp\htdocs\TutorialsPoint\src
             - Compile the program like this
                D:\Installations\xampp\htdocs\TutorialsPoint\src>javac -cp . com\learning\day12\CopyFile.java
             - Run the program like this
                D:\Installations\xampp\htdocs\TutorialsPoint\src>java -cp . com.learning.day12.CopyFile
            */
            long start = System.currentTimeMillis();
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            long end = System.currentTimeMillis();
            long elapsedTime = end - start;
            System.out.println("Elapsed time using a ByteStream is: " + elapsedTime);
        /*
         // If we throw the IOException in the method signature, then no need for the catch blocks
        } catch (FileNotFoundException e) { // To catch exceptions thrown by File(Input/Output)Stream classes
            e.printStackTrace();
        } catch (IOException e) { // To catch exceptions thrown by read() and write() methods
            e.printStackTrace();
        */
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
