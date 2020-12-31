package com.learning.day14;

public class CheckingAccount {
    private double balance;
    private int accountNumber;

    public CheckingAccount(int accountNumber) {
        this.accountNumber = accountNumber; // the "this" keyword identifies which one is the instance and local variables
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double topupRequired = amount - balance;
            throw new InsufficientFundsException(topupRequired);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return accountNumber;
        // No need for this keyword here since we are dealing with the instance variable initially
    }
}
