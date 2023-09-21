package com.ramjava.java.basics.serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) {
        var emp = new Emp();
        emp.name = "Huskey Blackey";
        emp.address = "Pasig City";

        try {
            var fileOut = new FileOutputStream("c:\\");
            var out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in char.txt file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
