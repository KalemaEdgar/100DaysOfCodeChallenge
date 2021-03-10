package com.learning.day26.serialization;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN; // mark a field as transient if its not serializable
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
