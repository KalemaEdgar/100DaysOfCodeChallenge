package com.learning.day17;

public class SecondsToHourMinuteSeconds {
    public static void main(String[] args) {
        int seconds = 86399; // 24 hours
        // Hour
        int hour = seconds / 3600; // to get hours from seconds, we divide the number by 60 minutes and 60 seconds making 3600
        // Minutes
        int minutes = seconds % 60;
        // split-seconds
        int split_seconds = minutes % 60;

        System.out.println(hour + ":" + minutes + ":" + split_seconds);
    }
}
