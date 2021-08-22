package com.learning.day29;

public class TestThread {
    public static void main(String[] args) {
        ThreadRunnableDemo TR1 = new ThreadRunnableDemo("Thread-1");
        TR1.start();

        ThreadRunnableDemo TR2 = new ThreadRunnableDemo("Thread-2");
        TR2.start();
    }
}
