package com.learning.day23;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        // Create the Sorted Set
        SortedSet set = new TreeSet();

        // TreeSet provides an implementation of the Set interface that uses a tree for storage.
        // Objects are stored in a sorted and ascending order.
        // Access and retrieval times are quite fast, which makes TreeSet an excellent choice when storing large amounts of sorted information that must be found quickly.

        // Add elements to the set
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("80");

        // Iterating over the elements in the set
        Iterator it = set.iterator();

        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}
