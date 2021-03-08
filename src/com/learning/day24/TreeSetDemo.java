package com.learning.day24;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        // TreeSet provides an implementation of the Set interface that uses a tree for storage.
        // Objects are stored in a sorted and ascending order.
        // Access and retrieval times are quite fast, which makes TreeSet an excellent choice when storing large amounts of sorted information that must be found quickly.

        // Create a tree set
        TreeSet ts = new TreeSet();

        // Add elements to the tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
