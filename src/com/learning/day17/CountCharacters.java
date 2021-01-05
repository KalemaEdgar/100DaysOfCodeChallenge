package com.learning.day17;

import java.util.regex.Pattern;

public class CountCharacters {
    public static void main(String[] args) {
        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int numberOfDigits = 0, numberOfSpaces = 0, numberOfOtherCharacters = 0, numberOfLetters = 0;

        char[] charItems = text.toCharArray();
        for (char c : charItems) {
            if (Character.isDigit(c))
                numberOfDigits++;
            else if (Character.isLetter(c))
                numberOfLetters++;
            else if (Character.isWhitespace(c))
                numberOfSpaces++;
            else
                numberOfOtherCharacters++;
        }

        System.out.println("The string is: " + text);
        System.out.println("Number of digits: " + numberOfDigits);
        System.out.println("Number of letters: " + numberOfLetters);
        System.out.println("Number of spaces: " + numberOfSpaces);
        System.out.println("Number of other characters: " + numberOfOtherCharacters);

        // Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        //Pattern pattern = Pattern.compile("\\d+");
        //System.out.println(pattern.matcher("12 3").matches()); // This is not a digit cause it has a space
    }
}
