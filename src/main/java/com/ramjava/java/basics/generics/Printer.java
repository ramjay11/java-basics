package com.ramjava.java.basics.generics;

// Generic class. <> is called TypeParameter
public class Printer<T> {
    // T type
    T thingToPrinter;
    public Printer(T thingToPrinter) {
        this.thingToPrinter = thingToPrinter;
    }
    public void printer() {
        System.out.println(thingToPrinter);
    }

}
