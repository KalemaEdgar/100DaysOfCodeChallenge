package com.learning.day13;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        String directoryName = "/tmp/user/java/bin";
        File dir = new File(directoryName);

        // Create the directory
        dir.mkdirs(); // mkdirs() method creates both a directory and all the parents of the directory.
        dir.mkdir(); // mkdir() creates the directory but not the parents. If the parents are not there, this fails
    }
}
