package com.learning.day9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalenderDemo {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // Create a Gregorian calendar initialized
        // with the current date and time in the default locale and timezone.
        GregorianCalendar gCalendarObject = new GregorianCalendar();
        System.out.println("Current date and time: " + gCalendarObject.getTime());
        System.out.println("Current month: " + months[gCalendarObject.get(Calendar.MONTH)]);

        // Display a date like 2020-12-21
        System.out.print("Date is: ");
        int year = gCalendarObject.get(Calendar.YEAR);
        System.out.print(year);
        System.out.print("-" + (gCalendarObject.get(Calendar.MONTH) + 1));
        System.out.println("-" + gCalendarObject.get(Calendar.DAY_OF_MONTH));

        // Check if the current year is a leap year
        String message = gCalendarObject.isLeapYear(year) ? year + " is a leap year" : year + " is not a leap year";
        System.out.println(message);

        // Check time using the GregorianCalender object and the calender class
        System.out.print("Time is: ");
        System.out.print(gCalendarObject.get(Calendar.HOUR));
        System.out.print(":" + gCalendarObject.get(Calendar.MINUTE));
        System.out.println(":" + gCalendarObject.get(Calendar.SECOND));
    }
}
