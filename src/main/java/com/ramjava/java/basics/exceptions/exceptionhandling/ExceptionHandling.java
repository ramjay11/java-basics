package com.ramjava.java.basics.exceptions.exceptionhandling;

/*
*  Hierarchy of Exception:
*  java.lang.Object
*   java.lang.Throwable
*    java.lang.Exception
*     java.lang.RuntimeException
*
* */
public class ExceptionHandling {
    public static void main(String[] args) {

        // You don't want to catch error (Throwable) just errors
        try {
            // Code that may cause an exception
            //int myInt = Integer.parseInt("pants");
            int myInt = Integer.parseInt("1");
        } catch (NumberFormatException nfe) {
            // Code that we want to execute if this type of exception occurred
            System.out.println("Hey dude, you can't make an int out of that");
        }
        System.out.println("End Here");
    }
}
