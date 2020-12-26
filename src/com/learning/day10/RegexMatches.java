package com.learning.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String[] args) {
        // String to be scanned to find the pattern
        String line = "The receipt number for your purchase is QT3000!";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        // Now create a matcher object
        Matcher m = r.matcher(line);

        if (m.find()) {
            // System.out.println(m.groupCount());
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("No match");
        }

        System.out.println("\n");
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(INPUT);   // get a matcher object
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + matcher.start());
            System.out.println("end(): " + matcher.end());
        }
    }
}