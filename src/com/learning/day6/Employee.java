package com.learning.day6;

public class Employee {
    String name;
    int age;
    double salary;
    String[] cities;

    Employee() {}

    Employee(String employeeName, int employeeAge, double employeeSalary) {
        name = employeeName;
        age = employeeAge;
        salary = employeeSalary;
    }

    public void setCities(String[] places) {
        cities = places;
    }

    public String[] getCities() {
        return cities;
    }

    public void printCities() {
        System.out.println("Employee details are:\nName: " + name + " \nAge is " + age + "\nand salary is " + salary);
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}


// Employee class
    // 2 constructors
        // Constructor overloading
        // no-arguments constructor
    // Properties {name, age, salary}
    // Methods
        // 1 employee
        // Has a list of cities that the employee has visited and then we print them out

// main class
