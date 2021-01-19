package com.learning.day19;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        System.out.println("Constructing a salary - within Salary class");
        setSalary(salary);
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public double computeSalary() {
        System.out.println("Computing salary for " + getName());
        return salary / 52;
    }

    public void mailCheque() {
        System.out.println("Within mailCheque of Salary class ");
        System.out.println("Mailing cheque to " + getName() + " with salary " + salary);
    }
}
