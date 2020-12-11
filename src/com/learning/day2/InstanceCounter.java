package com.learning.day2;

public class InstanceCounter {
    private static int numberOfInstances = 0;

    protected static int getNumberOfInstances() {
        return numberOfInstances;
    }

    private static void addInstance() {
        numberOfInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Starting with " + InstanceCounter.getNumberOfInstances() + " number of instances");

        for (int i = 0; i < 500; ++i) {
             new InstanceCounter();
        }

        System.out.println("Ending with " + InstanceCounter.getNumberOfInstances() + " number of instances");
    }
}
