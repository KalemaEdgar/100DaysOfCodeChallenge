package com.learning.day5;

public class StringClass {
    public static void main(String[] args) {
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String greeting = new String(helloArray);
        System.out.println(greeting);

        String anotherGreeting = String.valueOf(helloArray);
        System.out.println(anotherGreeting);

        String concatenatedString = greeting.concat(" - I have just been concatenated using concat() method");
        System.out.println(concatenatedString);

        System.out.println("Using println - The length of the greeting is " + greeting.length());
        System.out.printf("Using printf - The length of the greeting is %d%n", greeting.length());

        // Using the String format() method
        float floatVariable = (float) 20.5; // 20.5f
        int intVariable = 60;
        String stringVariable = "Kalema Ed";
        String fs;
        fs = String.format("The value of the float variable is %f" +
                ", the value of the integer is %d" +
                "and the string value is %s", floatVariable, intVariable, stringVariable);
        System.out.println(fs);

        // String methods
        String testString = "Strings are immutable Lorem ipsum dolor sit amet, consectetur adipiscing e";
        char result = testString.charAt(5);
        System.out.println("The character at position 5 is " + result);

        // string.equals() method
        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is a test string");
        boolean retVal;
        retVal = Str1.equals(Str2);
        System.out.println("Returned Value = " + retVal );
        retVal = Str1.equals(Str3);
        System.out.println("Returned Value = " + retVal );
    }
}