package com.learning.day18;

class SuperClass2 {
    int age;

    // Constructor for the super-class
    SuperClass2(int age) {
        this.age = age; // "this" differentiates between the instance variable and the local variable (age)
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }
}

public class CallSuperClassConstructor extends SuperClass2 {
    CallSuperClassConstructor(int age) {
        super(age);
    }

    public static void main(String[] args) {
        CallSuperClassConstructor demo = new CallSuperClassConstructor(45);
        demo.getAge();
    }
}