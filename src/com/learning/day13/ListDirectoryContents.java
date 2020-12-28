package com.learning.day13;

import java.io.File;
import java.io.FilenameFilter;

public class ListDirectoryContents {
    public static void main(String[] args) {
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("/testshell");
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Free space: " + file.getFreeSpace());
            System.out.println("Last modified: " + file.lastModified());

            // Check if the directory exists
            if ( ! file.exists()) {
                throw new Exception("Path specified does not exist");
            }

            // Check if its a directory
            if ( ! file.isDirectory()) {
                throw new Exception("Path specified is not a directory");
            }

            // array of files and directory
            paths = file.list();

            // Display the contents
            System.out.println("\n---- Contents in the directory ----");
            for (String path : paths) {
                // System.out.println(file.getName());
                System.out.println(path);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
