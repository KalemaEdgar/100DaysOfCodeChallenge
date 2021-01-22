package com.learning.day20;

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    Employee(String name, String address, int number) {
        System.out.println("Employee constructor ************");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public abstract boolean checkRetirement();

    public double computePayment() {
        System.out.println("Inside Employee computePay");
        return 10000;
    }

    public void mailCheque() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setName(String newName) {
        name = newName;
    }
}
