package com.learning.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchesAndLookingAt {
    // The matches and lookingAt methods both attempt to match an input sequence against a pattern.
    // The difference, however, is that matches requires the entire input sequence to be matched, while lookingAt does not.
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main( String args[] ) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());
    }
}