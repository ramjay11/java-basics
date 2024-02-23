package com.ramjava.java.basique.loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachLoop {
    public static void main(String[] args) {
        // Example with an array
        int arr[] = {10, 11, 12, 13, 14, 15};
        System.out.println("Array elements are:");
        for (int ele : arr) {
            System.out.println(ele);
        }
        // Example with a collection (ArrayList)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("\nIterating over a collection");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Create a HashMap with key-value pairs
        HashMap<String, Integer> eras = new HashMap<>();
        eras.put("Stone Age", 3);
        eras.put("Classical Era", 5);
        eras.put("Medieval Era", 8);
        System.out.println("");
        // Iterate over the HashMap using a foreach loop
        System.out.println("Iterating over a HashMap");
        for (Map.Entry<String, Integer> entry : eras.entrySet()) {
            String name = entry.getKey();
            int era = entry.getValue();
            System.out.println(name + ": " + era);
        }
        System.out.println("");
        // Iterate over the values using forEach
        System.out.println("Iterating over values using forEach:");
        eras.values().forEach(value -> System.out.println(value));
    }
}
