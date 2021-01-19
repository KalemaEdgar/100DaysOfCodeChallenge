package com.learning.day19;

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Kalema Edgar", "Kampala", 12, 500000000);
        Employee e = new Salary("Regina Kalema", "Kyanja", 2, 1000000000);

        System.out.println("\nCall mailCheque using Salary reference --");
        s.mailCheque();
        System.out.println("\nCall mailCheque using Employee reference --");
        e.mailCheque();
    }
}
