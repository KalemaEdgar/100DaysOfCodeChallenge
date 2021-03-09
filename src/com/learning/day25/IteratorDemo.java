package com.learning.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        // add elements to the array list
        al.add("K");
        al.add("D");
        al.add("V");
        al.add("A");
        al.add("F");
        al.add("B");

        System.out.println("Contents of the ArrayList collection al --- " + al);

        // Iterator enables you to cycle through a collection, obtaining or removing elements.
        // ListIterator extends Iterator to allow bidirectional traversal of a list, and the modification of elements.
        // Before you can access a collection through an iterator, you must obtain one.
        // Each of the collection classes provides an iterator( ) method that returns an iterator to the start of the collection.
        // By using this iterator object, you can access each element in the collection, one element at a time.
        // In general, to use an iterator to cycle through the contents of a collection, follow these steps −
        //      Obtain an iterator to the start of the collection by calling the collection's iterator( ) method.
        //      Set up a loop that makes a call to hasNext( ). Have the loop iterate as long as hasNext( ) returns true.
        //      Within the loop, obtain each element by calling next( ).

        // Use iterator to display contents of al
        Iterator itr = al.iterator();
        System.out.print("Elements in the ArrayList Collection traversed using an Iterator --- ");
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + ", ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }

        // Display the modified elements of the Collection
        System.out.print("Modified contents of the list al --- ");
        itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + ", ");
        }
        System.out.println();

        // Display the list backwards
        System.out.print("Modified list backwards --- ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}