package com.learning.day6;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Edgar", 20, 12000000);
        String[] places = {"Nairobi", "Kampala", "Entebbe"};
        emp.setCities(places);
        emp.printCities();

        Employee emp2 = new Employee("Jack", 85, 12000);
        String[] places2 = {"Nairobi", "Washington", "Arusha", "Nateete"};
        emp2.setCities(places2);
        emp2.printCities();

        // String - is not immutable. So when you append something to the string variable, Java reads the content of the current variable,
        // appends or changes the string value, and then creates a new memory location for the new string
        // The old variable will be removed later by the garbage collector
        // This has performance issues if you are doing it frequently
        // Strings are usually good for like constants - things like company name that you dont hope to change that much
        String name = "Jack"; // Assigned in memory location AB
        name = name + "son"; // Will be put in memory location CD. Data in location AB will be removed later

        // Use StringBuilder if you want to have strings that are ever changing. Like if you keep appending to a string
        // The same memory location is utilised
        StringBuilder name2 = new StringBuilder("Jack"); // Incase you want to have changing strings
        name2.append("son"); // does not create another string in memory
    }
}
