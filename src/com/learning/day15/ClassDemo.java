package com.learning.day15;

class InnerClassesDemo {
    int number;

    // Inner class declaration
    private class InnerClass {
        public void printMessage() {
            System.out.println("This is an inner class declared as private");
        }
    }

    public class InnerClass2 {
        public void printMessage2() {
            System.out.println("This is the public (access identifier) implementation of the inner class");
        }
    }

    // Accessing the inner class from the method within
    public void displayInner() {
        InnerClass inner = new InnerClass();
        inner.printMessage();
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        // Instantiating the outer class InnerClassesDemo
        InnerClassesDemo outer = new InnerClassesDemo();
        // Accessing the displayInner() method which gives you access to the InnerClass
        outer.displayInner();

        InnerClassesDemo.InnerClass2 inner = outer.new InnerClass2();
        inner.printMessage2();
    }
}