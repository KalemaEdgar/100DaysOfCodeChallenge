package com.learning.day20;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary sal = new Salary("Kalema", "Stockholm", 1245555, 457888888);
        Employee emp = new Salary("Regina", "Stockholm", 1245555, 457888888);
        System.out.println("Call mailCheque using Salary reference --");
        sal.mailCheque();
        System.out.println("\nCall mailCheque using Employee reference--");
        emp.mailCheque();
    }
}
