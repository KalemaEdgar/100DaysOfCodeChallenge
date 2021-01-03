package com.learning.day16;

public class DisplayPatterns {
    public static void main(String[] args) {
        System.out.printf("%4c%5c%4c%6c%3c\n", 'J', 'a', 'v', 'v', 'a');
        System.out.printf("%4c%4c%2c%4c%4c%3c%2c\n", 'J', 'a', 'a', 'v', 'v', 'a', 'a');
        System.out.printf("J%3c%7s%4c%2c%7s\n", 'J', "aaaaa", 'V', 'V', "aaaaa");
        System.out.printf("%3s%3c%6c%4c%3c%6c\n", "JJ", 'a', 'a', 'V', 'a', 'a');

        System.out.println();
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
}

/*
   J    a   v     v  a
   J   a a   v   v  a a
J  J  aaaaa   V V  aaaaa
 JJ  a     a   V  a     a
*/
