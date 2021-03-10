package com.learning.day26.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee emp = null;

        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) { // Declared by the FileInputStream operations
            ex.printStackTrace();
            return;
        } catch (ClassNotFoundException c) { // Declared by the readObject method
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + emp.name);
        System.out.println("Address: " + emp.address);
        System.out.println("Number: " + emp.number);
        System.out.println("SSN: " + emp.SSN); // value will be 0. Since the field is transient, the value was not sent to the output stream.
    }
}
