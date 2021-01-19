package com.learning.day18;

interface AnimalInterface {}
class MammalClass implements AnimalInterface {}

public class DogInterfaces extends MammalClass {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}
