package com.learning.day21;

/*
Benefits of Encapsulation
- The fields of a class can be made read-only or write-only.
- A class can have total control over what is stored in its fields.
*/

public class EncapsulationTest {
    private String name; // Instance variables
    private String identityNumber;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
