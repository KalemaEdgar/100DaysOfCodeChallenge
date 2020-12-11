package com.learning.day2;

public class ConstructorsUsage {
    public static void main(String[] args) {
        // Using no argument constructors
        ConstructorTest obj = new ConstructorTest();
        System.out.println(obj.population);

        // Using parameterised constructors
        ConstructorTest object2 = new ConstructorTest(40000);
        System.out.println(object2.population);
    }
}
