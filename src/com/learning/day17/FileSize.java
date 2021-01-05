package com.learning.day17;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        try {
            File fileName = new File("D:/testshell/sample-input.txt");
            System.out.println(fileName.length());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
