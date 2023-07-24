package com.ramjava.java.basics.generics;

import java.util.ArrayList;

public class GenericsSample {
    public static void main(String[] args) {
        // Generics don't work with primitive types (int, float)
//        IntegerPrinter printer = new IntegerPrinter(11);
//        printer.print();
        Printer<Integer> print = new  Printer<>(11);
        print.printer();
        Printer<Double> doublePrinter = new  Printer<>(11.1);
        doublePrinter.printer();
        // Generics usually used in Collection Framework
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Blackey", 88));
        cats.add(new Cat("Meowmie", 89));
        // Not typesafe
        ArrayList<Object> dogs = new ArrayList<>();

    }
}
