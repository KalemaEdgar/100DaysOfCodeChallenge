package com.learning.day17;

import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class InputAndDisplayPassword {
    public static void main(String[] args) {
        //System.out.print("Input your password: ");
        //Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        //String password = input.nextLine();
        //System.out.println("Your entered password is: " + password);

        Console cons;
        if ((cons = System.console()) != null)
        {
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get password...No console");
        }
    }
}
