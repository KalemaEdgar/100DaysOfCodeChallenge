package com.learning.day19;

class Animal {
    public void move() {
        System.out.println("Animals breathe and can locomote");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs move on 4 legs");
    }
    public void bark() {
        System.out.println("Dogs can bark on top of moving");
    }
}

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal reference and object
        Animal d = new Dog(); // Animal reference but Dog object
        a.move(); // runs the method in Animal class
        d.move(); // runs the method in Dog class
        //d.bark(); // This will fail since there is no bark() method in the Animal class
        /*
        even though b is a type of Animal it runs the move method in the Dog class.
        The reason for this is: In compile time, the check is made on the reference type.
        However, in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.
        */
    }
}