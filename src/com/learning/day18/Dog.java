package com.learning.day18;

class Animal {}
class Mammal extends Animal {}
class Reptile extends Animal {}

public class Dog extends Mammal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        System.out.println("mammal object instanceof Animal class: " + (mammal instanceof Animal));
        System.out.println("dog object instanceof Mammal class: " + (dog instanceof Mammal));
        System.out.println("dog object instanceof Animal class: " + (dog instanceof Animal));
    }
}
