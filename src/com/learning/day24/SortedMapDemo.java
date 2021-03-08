package com.learning.day24;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // Create a HashMap.
        // SortedMap has its implementation in various classes like TreeMap.
        TreeMap tm = new TreeMap();

        // Put elements in the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = tm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // Deposit 20000 into Zara's account
        double oldBalance = ((Double) tm.get("Zara")).doubleValue();
        System.out.println("Zara's old balance: " + tm.get("Zara"));
        double newBalance = new Double(oldBalance + 20000);
        tm.put("Zara", newBalance);
        System.out.println("Zara's new balance: " + tm.get("Zara"));
    }
}
