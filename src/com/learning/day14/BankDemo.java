package com.learning.day14;

public class BankDemo {
    // demonstrates invoking the deposit() and withdraw() methods of CheckingAccount
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(400012);
        System.out.println("Depositing Shs 12000...");
        account.deposit(12000);
        System.out.println("Current account balance is: " + account.getBalance());

        try {
            System.out.println("********************************************************************");
            System.out.println("Withdrawing Shs 10000...");
            account.withdraw(10000);
            System.out.println("Account balance is: " + account.getBalance());
            System.out.println("********************************************************************");
            System.out.println("Withdrawing Shs 45000...");
            account.withdraw(45000);
        } catch (InsufficientFundsException ex) {
            System.out.println("Exception handled - You are short Shs " + ex.getAmount());
            ex.printStackTrace();
        }
    }
}
