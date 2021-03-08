package com.learning.day23;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        // Create the Sorted Set
        SortedSet set = new TreeSet();

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
