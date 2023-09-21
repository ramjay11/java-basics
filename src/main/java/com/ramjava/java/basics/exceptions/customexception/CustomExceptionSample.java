package com.ramjava.java.basics.exceptions.customexception;

public class CustomExceptionSample {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(3);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            //throw new Exception();  this is a generic exception
            throw new AgeLessThanZeroException();
        }
    }
}
