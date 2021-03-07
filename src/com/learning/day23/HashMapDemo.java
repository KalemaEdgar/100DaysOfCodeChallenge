package com.learning.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a Hash map
        HashMap hm = new HashMap();

        // Put elements into the map
        hm.put("Edgar", new Double(8996.12));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        // Get a set of all entries
        Set set = hm.entrySet();

        // Get an iterator
        Iterator it = set.iterator();

        // Display elements
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Edgar's account
        double balance = ((Double) hm.get("Edgar")).doubleValue();
        hm.put("Edgar", new Double(balance + 1000));
        System.out.println("Edgar's new balance: " + hm.get("Edgar"));
    }
}
