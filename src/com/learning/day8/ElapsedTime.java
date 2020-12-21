package com.learning.day8;

import java.util.Date;

public class ElapsedTime {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());

            // Sleep for 3 seconds. Value is passed in milliseconds
            Thread.sleep(3000);

            long end = System.currentTimeMillis();
            System.out.println(new Date());

            long elapsedTime = end - start;
            System.out.println("Elapsed time is: " + elapsedTime);
            
        } catch (Exception e) {
            System.out.println("Got an exception" + e.getMessage());
            e.printStackTrace();
        }
    }
}
