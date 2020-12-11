package com.learning.day2;

public class InstanceVariables {
    public String name; // Public instance variable can be accessed in the constructor or any other method directly
    private double salary = 0d; // Private instance variable requires setter method to access it

    public InstanceVariables(String employeeName) {
        name = employeeName;
    }

    public void setSalary(double employeeSalary) {
        salary = employeeSalary;
    }

    public void printDetails() {
        System.out.println("Employee name  : " + name);
        System.out.printf("Employee salary: %.0f", salary);
    }

    public static void main(String[] args) {
        InstanceVariables employee = new InstanceVariables("Edgar Kalema");
        employee.setSalary(40000000);
        employee.printDetails();
    }
}