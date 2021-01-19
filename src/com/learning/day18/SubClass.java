package com.learning.day18;

class SuperClass {
    int num = 30;
    public void display() {
        System.out.println("This is the display from the super class. It cannot be called from a static method");
    }
}

public class SubClass extends SuperClass {
    int num = 12;

    public void display() {
        System.out.println("This is the display from the sub class");
    }

    public void myMethod() {
        // Instantiate the sub-class
        SubClass subClass = new SubClass();

        // Call the display() method of the sub-class
        subClass.display();

        // Call the display() method of the super-class
        super.display();

        // Printing the value of variable num of sub-class
        System.out.println("Value of the variable named num in sub class: " + subClass.num);

        // Printing the value of variable num of super-class
        System.out.println("Value of the variable named num in super class: " + super.num);
    }

    public static void main(String[] args) {
        SubClass demo = new SubClass();
        demo.myMethod();
    }
}
