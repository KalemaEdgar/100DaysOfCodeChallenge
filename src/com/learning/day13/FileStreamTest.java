package com.learning.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {2, 45, 11, 67, 90};

            // Write the byte array to a file
            System.out.println("Writing the byte array \"" + Arrays.toString(bWrite) + "\" to the file testfiles.txt");
            OutputStream fWrite = new FileOutputStream("testfiles.txt");
            fWrite.write(bWrite);
            fWrite.close();

            // Other implementation to write the byte contents to a file
            //for (int i = 0; i < bWrite.length; i++) {
            //    fWrite.write( bWrite[i] ); // Writes the bytes
            //}

            // Read the contents from the file and display them
            System.out.println("Reading the bytes data from the file testfiles.txt");
            InputStream fRead = new FileInputStream("testfiles.txt");
            System.out.print("Contents: ");
            while (fRead.available() > 0) {
                System.out.print(fRead.read() + " ");
            }

            // Other implementation of the above
            //int size = fRead.available();
            //for (int i = 0; i < size; i++) {
            //    System.out.print(fRead.read() + " ");
            //}
            fRead.close();

        } catch (IOException exception) {
            System.out.println("Exception encountered: " + exception.getMessage());
        }
    }
}
