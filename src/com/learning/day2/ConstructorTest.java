package com.learning.day2;

public class ConstructorTest {
    int population; // Instance variable

    ConstructorTest() { // No arguments constructor. Usually used to initialise instance variables
        population = 1000000;
    }

    // We can have more than 1 constructor in a class in Java
    ConstructorTest(int numberOfPeople) { // Parameterized constructor. Has arguments
        population = numberOfPeople;
    }

    ConstructorTest(int numberOfPeople, String name) { // Parameterized constructor. Has arguments
        population = numberOfPeople;
    }
}
