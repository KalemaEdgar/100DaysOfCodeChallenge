package com.learning.day22;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    // Stack is a subclass of Vector that implements a standard last-in, first-out stack.
    // Vector implements a dynamic array. It is similar to ArrayList, but with some differences.

    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 12);
        showpush(st, 93);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException exception) {
            exception.printStackTrace();
        }
    }
}
