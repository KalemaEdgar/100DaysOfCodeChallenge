package com.learning.day23;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // The Set interface does not allow duplicates
        int[] numbers = {40, 12, 78, 22, 36, 90};
        Set<Integer> set = new HashSet<Integer>();

        try {
            for (int i = 0; i < numbers.length; i++) {
                set.add(numbers[i]);
            }
            System.out.println("The HashSet is: " + set);

            TreeSet sortedSet = new TreeSet<Integer>(set); // In a TreeSet, objects are stored in a sorted and ascending order.
            System.out.print("The sorted list (using a TreeSet interface) is: " + sortedSet);
            System.out.println();
            System.out.println("The first element of the SortedSet is: " + (Integer) sortedSet.first());
            System.out.println("The last element of the SortedSet is: " + (Integer) sortedSet.last());

        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
            // System.out.println(e.getStackTrace());
        }
    }
}
