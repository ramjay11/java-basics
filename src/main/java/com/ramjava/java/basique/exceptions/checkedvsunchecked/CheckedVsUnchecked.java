package com.ramjava.java.basique.exceptions.checkedvsunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        // If file does not exist, it will throw FileNotFoundException, it is checked exception, a compilation error
        // you could resolve it by using try-catch block or add throws FilNotFoundException in the method signature
        readFile("myFile.txt");
    }
    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException fnfe) {
            System.out.println("That file doesn't exist");
        }
    }
}
