package com.ramjava.java.basics.streams.java8streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Huskey");
        list.add("Blackey");
        list.add("Siber");
        list.add("Saint");
        // traditional for loop
        for (String s : list) {
            System.out.println(s);
        }
        // stream api
        list.stream().forEach(t -> System.out.println(t));
        // Maps
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        //
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        // iterate
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

    }
}
