package com.learning.day13;

import java.io.*;
import java.util.Arrays;

public class FileManagement {
    public static void main(String[] args) throws IOException {
        InputStream fin = null;
        OutputStream fout = null;
        try {
            // First way of creating an input stream object to read the file
             fin = new FileInputStream("D:/testshell/sample-input.txt");
             fout = new FileOutputStream("D:/testshell/sample-output.txt");

            // Second way of creating an input stream object to read the file
            // File f = new File("D:/testshell/sample-input.txt");
            // fin = new FileInputStream(f);
            // File f = new File("D:/testshell/sample-output.txt");
            // fout = new FileInputStream(f);

            // Gives the number of bytes that can be read from this file input stream (int).
            System.out.println("Available number of bytes to read: " + fin.available());

            // int nextByteOfData;
            //while ((nextByteOfData = fin.read()) != -1) {
            //    nextByte = fin.read();
            //    fout.write(nextByte);
            //    System.out.println("I am learning stuff " + nextByte);
            //}

            // Using the available() method to check if there is still data for reading
            while (fin.available() > 0) {
                int nextByte = fin.read();
                fout.write(nextByte);
                // System.out.println("I am learning stuff " + nextByte);
            }

            System.out.println("Available number of bytes to read: " + fin.available());

        } catch (FileNotFoundException ex) {
            // ex.printStackTrace();
            System.out.println(ex.getCause());
            System.out.printf("Exception encountered: %s%n", ex.toString());
            // System.out.printf("Exception encountered: %s%n", ex.getMessage());
            // System.out.println(Arrays.toString(ex.getStackTrace()));

        } finally {
            // finally block always executes, irrespective of occurrence of an Exception.
            // Using a finally block allows you to run any cleanup-type statements, no matter what happens in the try/catch block.
            if (fin != null) {
                fin.close();
            }

            if (fout != null) {
                fout.close();
            }

            System.out.println("finally block always executes, irrespective of occurrence of an Exception.");
        }
    }

    protected void finalize() throws IOException {
        // Research more about this method
        // This method cleans up the connection to the file.
        // Ensures that the close method of this file output stream is called when there are no more references to this stream.
        System.out.println("This is interesting");
    }
}
