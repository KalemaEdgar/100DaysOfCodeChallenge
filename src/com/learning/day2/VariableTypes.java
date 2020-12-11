package com.learning.day2;

public class VariableTypes {
    public void displayAge() {
        int age = 0; // Local variables donot have default values so they need to be initialised before using them.
        age = age + 7;
        System.out.println("The age is " + age);
    }

    public static void main(String[] args) {
        VariableTypes test = new VariableTypes();
        test.displayAge();
    }
}
