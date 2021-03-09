package com.learning.day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;

    Dog() {}

    Dog(String n, int a) {
        name = n;
        age = a;
    }

    public String getDogName() {
        return name;
    }

    public int getDogAge() {
        return age;
    }

    // Overriding the compareTo method
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Overriding the compare method to sort the age
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Takes a list of Dog objects
        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        System.out.println("******* Original Collection Entries Dog Name : Dog Age *******");
        for(Dog dog : list) {
            System.out.print(dog.getDogName() + ": " + dog.getDogAge() + ", ");
        }

        System.out.println("\n\n******* Second way to display the list entries ***************");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getDogName() + ": " + list.get(i).getDogAge() + ", ");
        }

        // System.out.println("Size of list: " + list.size());

        Collections.sort(list); // Sorts the ArrayList
        // Printing the sorted list of names
        System.out.println("\n\n******* Sorted list of names *********************************");
        for (Dog a: list)
            System.out.print(a.getDogName() + ", ");

        // Sorts the array list using comparator
        Collections.sort(list, new Dog());
        System.out.println("\n\n******* Sorted list of ages **********************************");
        // Printing the sorted list of ages
        for(Dog a: list)
            System.out.print(a.getDogName() + ": " + a.getDogAge() + ", ");

        System.out.println();
    }
}
