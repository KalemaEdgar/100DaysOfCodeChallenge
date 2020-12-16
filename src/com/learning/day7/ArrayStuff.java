package com.learning.day7;

import java.util.Arrays;

public class ArrayStuff
{
    public static void main(String[] args)
    {

        String[] places3 = new String[4];
        places3[0] = "Testing 0";
        places3[1] = "Testing 1";
        places3[2] = "Testing 2";
        places3[3] = "Testing 3";
        // Foreach loop to display the array entries
        for (String place: places3) {
            System.out.println(place);
        }

        // Second declaration
        String[] names = {"Edgar", "Kalema", "Jojo"};
        System.out.println("\nDisplay the names in an array using the foreach loop");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nDisplay the names in an array using the for-iteration loop");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name with second for loop: " + names[i]);
        }

        System.out.println("\nDisplay the names in reverse order from how they are entered");
        for (int i = names.length; i > 0 ; --i) {
            System.out.println("Names reversed: " + names[i - 1]);
        }
        // Second way of achieving the same reversal above
        for (int i = names.length - 1; i >= 0 ; --i) { // --i decrements and then assigns
            System.out.println("Names reversed: " + names[i]);
        }

        System.out.println("\nSumming up elements in an array");
        double[] marks = {12.3, 2.4, 100};
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("The total marks for the students is " + total);

        System.out.println("\nFinding the largest element in an array");
        double maximumValue = marks[0];
        for (int i = 0; i < marks.length; i++) {
            maximumValue = marks[i] > maximumValue ? marks[i] : maximumValue;
        }
        System.out.println("The maximum value is " + maximumValue);

        System.out.println("\nPassing arrays to a method printArrayDetails(String[] name)");
        printArrayDetails(new String[]{"Regina", "Nankya", "Josiah"});

        System.out.println("\nReversing numbers and returning an array from the methods reverseInt() and reverse()");
        // int[] resultInfo = reverse(new int[]{9,7,3});
        int[] resultInfo = reverseInt(new int[]{9,7,3});
        for (int data: resultInfo) {
            System.out.println(data);
        }

        // Checking if 2 arrays match
        System.out.println(names.equals(places3)); // should return false
        String[] names2 = {"Kalema", "Edgar", "Jojo"};
        System.out.println(names.equals(names2)); // should return false cause the elements need to have the same position

        System.out.println("\nBinary search in an array");
        int[] numbers = {9,4,1,2,20,5};
        Arrays.sort(numbers); //Binary Search requires the array to be sorted
        System.out.println(Arrays.binarySearch(numbers, 5));

        System.out.println("\nFill each element in an array to a specified value");
        int[] data = {9,4,1,2,20,5};
        System.out.println("Before filling the elements. Array looks like");
        for (int item: data) {
            System.out.print(item + ", ");
        }
        // Now fill the elements
        Arrays.fill(data, 4);
        System.out.println("\nAfter filling the elements. Array looks like");
        for (int item: data) {
            System.out.print(item + ", ");
        }
    }

    /**
     * How to pass arrays to methods
     * @param names
     */
    public static void printArrayDetails(String[] names) {
        for (String name: names) {
            System.out.println("Printed name is: " + name);
        }
    }

    /**
     * Returning arrays from a method
     * We start with the last element in result which will contain the first element in list array
     * @param list integer-array
     * @return result integer-array     *
     */
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            // System.out.println(i);
            result[j] = list[i];
        }
        return result;
    }


    /**
     * Returning arrays from a method
     * For this method, the first element in result will contain the last element in list array
     */
    public static int[] reverseInt(int[] list) {
        int[] result = new int[list.length];
        for (int i = list.length, j = 0; i > 0; --i, j++) {
            result[j] = list[i - 1];
        }
        return result;
    }
}
