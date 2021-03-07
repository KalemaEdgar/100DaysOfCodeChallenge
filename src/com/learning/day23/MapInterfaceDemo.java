package com.learning.day23;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Name", "Edgar Kalema");
        map.put("Age", "20");
        map.put("NetIncome", "a trillion dollars");
        map.put("SpouseName", "Regina Kalema");

        System.out.println("All elements in the map: " + map);
        System.out.println("Element at the key 'Name': " + map.get("Name"));
        System.out.println("Does element at the key 'Name' equals 'Hello': " + map.get("Name").equals("Hello"));
        System.out.println("Size of the map: " + map.size());
        System.out.println("KeySet of the map: " + map.keySet());
        System.out.println("EntrySet of the map: " + map.entrySet());
        System.out.println("Map contains key 'Age': " + map.containsKey("Age"));
        System.out.println("Map does not contain key 'Salary': " + map.containsKey("Salary"));
    }
}
