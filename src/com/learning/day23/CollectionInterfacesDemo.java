package com.learning.day23;

import java.util.*;

public class CollectionInterfacesDemo {
    public static void main(String[] args) {
        // ArrayList
        List a1 = new ArrayList();
        a1.add("Edgar");
        a1.add("Regina");
        a1.add("Jojo");
        a1.add("Josiah");
        a1.add("Edgar");
        System.out.println("ArrayList Elements -- " + a1);
        System.out.println("ArrayList Size -- " + a1.size());
        System.out.println("ArrayList get second element -- " + a1.get(1));

        // LinkedList - Can contain duplicates
        List l1 = new LinkedList();
        l1.add("Edgar");
        l1.add("Jojo");
        l1.add("Regina");
        l1.add("Edgar");
        l1.add(1, "Reginahh"); // void add(int index, Object obj)
        l1.add("Josiah");
        l1.add("Regina");
        l1.add(7, "LastItem"); // void add(int index, Object obj)
        System.out.println("\nLinkedList Elements -- " + l1);
        System.out.println("LinkedList Size -- " + l1.size());
        System.out.println("LinkedList get second element -- " + l1.get(1));
        System.out.println("LinkedList get indexOf 'Jojo' -- " + l1.indexOf("Jojo"));
        System.out.println("LinkedList get lastIndexOf 'Regina' -- " + l1.lastIndexOf("Regina"));
        System.out.println("LinkedList get subList from 2 to 5 -- " + l1.subList(2,5));

        // HashSet - Cannot contain duplicates
        // Set hs1 = new HashSet();
        HashSet hs1 = new HashSet();
        hs1.add("Ked");
        hs1.add("Balungi");
        hs1.add("Racheal");
        hs1.add("Ked"); // This replaces the original "Ked" element cause duplicates are not allowed in a HashSet
        System.out.println("\nHashSet Elements -- " + hs1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("1 key", "value");
        m1.put("8", "Kalema");
        m1.put("EddieBright", "31");
        m1.put("Anthony", "12");
        m1.put("Nankya", "14");
        System.out.println("\nHashMap Elements -- " + m1);
        System.out.println("HashMap size: " + m1.size());
        System.out.println("HashMap get entry at key '8': " + m1.get("8"));
        m1.put("8", "Replaced Entry"); // Key 8's value is replaced cause Map interface replaces the value if same key is used
        System.out.println("Outputting the value in key 8: " + m1.put("8", "NewEntry")); // put returns null if the key did not already exist. Otherwise, the previous value linked to the key is returned.
        System.out.println("HashMap get entry at key '8' after replacing: " + m1.get("8"));
    }
}
