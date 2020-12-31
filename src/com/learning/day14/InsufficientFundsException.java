package com.learning.day14;

public class InsufficientFundsException extends Exception {
    /**
     * This class is a user-defined exception that extends the Exception class, making it a checked exception.
     * An exception class is like any other class, containing useful fields and methods.
     */
    private double amount;

    InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}