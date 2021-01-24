package com.learning.day21;

public class RunEncapsulation {
    public static void main(String[] args) {
        EncapsulationTest enc = new EncapsulationTest();
        enc.setAge(30);
        enc.setIdentityNumber("CMF12324324234234");
        enc.setName("Kalema Edgar");

        System.out.println("Name : " + enc.getName() + " Age : " + enc.getAge());
    }
}
