package com.learning.day16;

public class PrintAmericanFlag {
    public static void main(String[] args) {
        String str1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String str2 = "==============================================";

        for (int i = 1; i <= 4; i++) {
            System.out.println(str1);
        }

        System.out.println("* * * * * * ==================================");

        for (int i = 0; i < 6; i++) {
            System.out.println(str2);
        }
    }
}

//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================