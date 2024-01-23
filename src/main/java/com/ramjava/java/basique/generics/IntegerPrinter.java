package com.ramjava.java.basique.generics;

public class IntegerPrinter {
    // Before Generics existed
    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    // method to print
    public void print() {
        System.out.println(thingToPrint);
    }
}
