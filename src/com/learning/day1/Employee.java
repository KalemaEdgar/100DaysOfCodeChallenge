package com.learning.day1;

public class Employee {
    int age; // Instance variable. Outside of any method, within a class and require an instance of the class to be used
    String name; // Instance variable.
    static int countOfParents; // This is a class variable cause of the keyword "static". Doesnot need the class to be instantiated to be used

    public Employee() {}

    public void setAge(int employeeAge) {
        // A variable declared inside here would be the local variable
        age = employeeAge;
    }

    public void setName(String employeeName) {
        name = employeeName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
