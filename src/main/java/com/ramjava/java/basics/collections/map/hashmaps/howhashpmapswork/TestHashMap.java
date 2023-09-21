package com.ramjava.java.basics.collections.map.hashmaps.howhashpmapswork;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        // Map is the interface that HashMap implements
        // Internally it creates a Node table which is transient
        Map<String, String> employees = new HashMap<>();
        // key-value stored in hashmap
        employees.put("Huskey", "1234");
        employees.put("Blackey", "2345");
    }
}
