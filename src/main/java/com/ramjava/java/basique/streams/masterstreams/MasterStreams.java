package com.ramjava.java.basique.streams.masterstreams;

import java.util.Arrays;
import java.util.List;

public class MasterStreams {
    public static void main(String[] args) {
        // Transform data in upper case
        List<String> names = Arrays.asList("philippines", "japan", "germany", "uk");
        // for loop
        /*
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
        */
        // use Stream map(Function function)
        names.stream().map(name -> name.toUpperCase())
                .forEach(n -> System.out.println(n));
    }

}
