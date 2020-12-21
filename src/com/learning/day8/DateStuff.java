package com.learning.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStuff {
    public static void main(String[] args) {
        // Getting the current date and time
        Date currentDateAndTime = new Date();
        System.out.println(currentDateAndTime.toString());

        // Formatting dates using SimpleDateFormat
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current date: " + ft.format(currentDateAndTime));

        // Formatting dates using printf
        String str = String.format("Current date/time: %tc", currentDateAndTime);
        System.out.printf(str);
        // A format string can indicate the index of the argument to be formatted
        System.out.printf("\n" + "%1$s %2$tB %2$td, %2$tY", "Due Date:", currentDateAndTime);
        // The other way of formatting the date
        System.out.printf("\n" + "%s %tB %<te, %<tY", "Due Date:", currentDateAndTime);

        Date applicationDate = new Date();
        boolean status = applicationDate.after(new Date(99,12,21));
        System.out.println("\nIs the current date and time after \"1999-02-12\": " + status);
        boolean statusAfter = applicationDate.after(new Date(99,12,21));
        System.out.println("Is the current date and time before \"1999-02-12\": " + statusAfter);

        System.out.println(applicationDate.getTime());

        // Time elapsed since "midnight, January 1, 1970"
        System.out.println(new Date(1600000));
    }
}
