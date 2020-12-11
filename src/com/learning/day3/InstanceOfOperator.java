package com.learning.day3;

public class InstanceOfOperator {
    public static void main(String[] args) {
        String name = "Edgar";
        boolean result;

        result = name instanceof String;
        System.out.println(result);

        InstanceOfOperator obj = new InstanceOfOperator();
        result = obj instanceof InstanceOfOperator;
        System.out.println(result);
    }
}
