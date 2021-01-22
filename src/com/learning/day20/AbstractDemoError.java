package com.learning.day20;

public class AbstractDemoError {
    public static void main(String[] args) {
        // This fails with "java: com.learning.day20.Employee is abstract; cannot be instantiated"
        // An abstracted is inherited and not instantiated
        // Employee emp = new Employee("Kalemaa", "Entebbe", 1000);
        // emp.mailCheque();
    }
}
