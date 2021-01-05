package com.learning.day17;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DisplayUniqueThreeDigits {
    public static void main(String[] args) {
        int count = 0;
        String leelo;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    leelo = i + "" + j + "" + k;
                    if ((k != i && j != i && k != j) || leelo.equals("111") || leelo.equals("444")) {
                        count++;
                        System.out.println(leelo);
                    }
                }
            }
        }
        System.out.println("Total number of three-digit patterns is: " + count);
    }
}