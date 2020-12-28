package com.learning.day11;

public class Student {
    public static void main(String[] args) {
        School school = new School();
    }
}

class School {
    String name; // Instance variable
    public School() {
        // Using explicit constructor invocation
        this("Kedz University");
    }

    public School(String name) {
        // Using this keyword to differentiate between the instance variable "name" and the local variable "name"
        this.name = name;
        System.out.println("School name: " + this.name);
    }
}
