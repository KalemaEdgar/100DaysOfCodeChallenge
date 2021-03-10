package com.learning.day26.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Kalema Edgar";
        emp.address = "Kyanja";
        emp.number = 120033;
        emp.SSN = 111223339;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.ser");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}