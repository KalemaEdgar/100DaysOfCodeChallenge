package com.learning.day29;

public class TestThreadDemo {
    public static void main(String[] args) {
        ThreadDemo TD1 = new ThreadDemo("Thread-1");
        TD1.start();

        ThreadDemo TD2 = new ThreadDemo("Thread-2");
        TD2.start();
    }
}
