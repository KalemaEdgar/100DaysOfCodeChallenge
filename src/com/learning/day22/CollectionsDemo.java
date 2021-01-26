package com.learning.day22;

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("firstName", "Kalema");
        m.put("Edgar", "31");
        m.put("Ayan", "12");
        m.put("Daisy", "14");
        System.out.println("Map details: " + m);
        System.out.println("Value of the key 'firstName' in the Map: " + m.get("firstName")); // Get the value of the key "Edgar"in the Map
        System.out.println("Size of the map is: " + m.size());
    }
}
