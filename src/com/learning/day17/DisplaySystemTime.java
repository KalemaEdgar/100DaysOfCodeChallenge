package com.learning.day17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DisplaySystemTime {
    public static void main(String[] args) {
        System.out.println(new Date());
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy/MM/dd hh:mm:ss.SSS a zzz");
        dateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EAT")));
        System.out.println(dateFormat.format(System.currentTimeMillis()));
    }
}
