package com.learning.day29;

class ThreadRunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    ThreadRunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start() {
        // start() method executes a call to the run() method
        System.out.println("Starting: " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}