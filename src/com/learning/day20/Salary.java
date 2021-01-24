package com.learning.day20;

public class Salary extends Employee {
    private double salary; // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheque() {
        System.out.println("Within mailCheque of Salary class ");
        System.out.println("Mailing cheque to " + getName() + " with salary " + salary);
    }

    // This has to be defined cause in the Abstract class 'Employee', it was declared as an abstract method
    public boolean checkRetirement() {
        return true;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
