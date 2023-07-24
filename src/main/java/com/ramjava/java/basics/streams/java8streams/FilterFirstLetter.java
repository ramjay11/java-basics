package com.ramjava.java.basics.streams.java8streams;

import java.util.ArrayList;
import java.util.List;

public class FilterFirstLetter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ramjay");
        names.add("Rahul");
        names.add("XYZ");
        names.stream()
                .filter(s -> s.startsWith("R"))
                .sorted()
                .forEach(System.out::println);
    }
}
