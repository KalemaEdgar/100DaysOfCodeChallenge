package com.learning.day22;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {
    public static void main(String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();
        // The Vector class is similar to a traditional Java array, except that it can grow as necessary to accommodate new elements.
        // Vector implements a dynamic array.

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }

        // Showing that the Vector is a dynamic array
        System.out.println(dayNames); // Display the array
        // System.out.println(dayNames.capacity());
        for (Object day: dayNames) {
            System.out.println(day);
        }

        dayNames.clear();
        System.out.println(dayNames.capacity());
    }
}
