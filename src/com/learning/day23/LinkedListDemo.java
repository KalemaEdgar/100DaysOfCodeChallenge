package com.learning.day23;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
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

        //// Second implementation
        System.out.println("\n******** SECOND IMPLEMENTATION ********");
        LinkedList ll = new LinkedList();

        // Add elements to the linked List
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Original contents of ll: " + ll);

        // Remove elements from a Linked List
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: " + ll);

        // remove first and last elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: " + ll);

        // Get and Set a value
        Object val = ll.get(2);
        ll.set(2, (String) val + " changed");
        System.out.println("ll after change: " + ll);
    }
}
