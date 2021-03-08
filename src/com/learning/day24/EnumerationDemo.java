package com.learning.day24;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration days;
        Vector day = new Vector();

        day.add("Sunday");
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thursday");
        day.add("Friday");
        day.add("Saturday");

        days = day.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
