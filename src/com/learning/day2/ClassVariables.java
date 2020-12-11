package com.learning.day2;

public class ClassVariables {
    public static final String DEPARTMENT = "Technology";
    private static double salary = 320000;
    private int age = 20;

    public static double printSalary() {
        return salary;
    }

    public double printSalary2() {
        return salary;
    }

    public static double accessNonStaticVariableFromStaticClass() {
        ClassVariables test = new ClassVariables();
        return test.printAge();
    }

    public int printAge() {
        return age;
    }
}

class Test {
    public static void main(String[] args) {
        ClassVariables testObject = new ClassVariables();
        System.out.println("The department is " + ClassVariables.DEPARTMENT);
        System.out.println("The salary is " + ClassVariables.printSalary());
        System.out.println("The salary 2 is " + testObject.printSalary2());
        System.out.println("The age is " + ClassVariables.accessNonStaticVariableFromStaticClass());
    }
}
