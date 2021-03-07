package com.learning.day23;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList - Can contain duplicates
        List l1 = new LinkedList();
        l1.add("Edgar");
        l1.add("Jojo");
        l1.add("Regina");
        l1.add("Edgar");
        l1.add(1, "Reginahh"); // void add(int index, Object obj)
        l1.add("Josiah");
        l1.add("Regina");
        l1.add(7, "LastItem"); // void add(int index, Object obj)
        System.out.println("\nLinkedList Elements -- " + l1);
        System.out.println("LinkedList Size -- " + l1.size());
        System.out.println("LinkedList get second element -- " + l1.get(1));
        System.out.println("LinkedList get indexOf 'Jojo' -- " + l1.indexOf("Jojo"));
        System.out.println("LinkedList get lastIndexOf 'Regina' -- " + l1.lastIndexOf("Regina"));
        System.out.println("LinkedList get subList from 2 to 5 -- " + l1.subList(2,5));
    }
}
