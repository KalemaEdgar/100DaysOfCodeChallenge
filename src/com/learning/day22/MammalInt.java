package com.learning.day22;

public class MammalInt implements Animal {
    public void eat() {
        System.out.println("This mammal eats");
    }

    @Override
    public void travel() {
        System.out.println("This mammal travels");
    }

    public int numberOfLegs() {
        return 4;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
