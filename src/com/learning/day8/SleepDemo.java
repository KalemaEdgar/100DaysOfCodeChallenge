package com.learning.day8;

import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) {
        try {
            System.out.println(new Date());
            Thread.sleep(5*60*10); //3000 milliseconds
            System.out.println(new Date());
        } catch (Exception e) {
            System.out.println("Got an exception");
            e.printStackTrace();
        }
    }
}
