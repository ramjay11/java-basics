package com.ramjava.java.basique.collections.vectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTesting {
    // Vectors are good on multithreaded environment
    public static void main(String[] args) throws InterruptedException {
        int size = 1000000;

        // Add a million items an Arraylist
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Added " + size + " Elements to ArrayList: " + (end - start) + "ms");

        // Add a million items a Vector
        List<Integer> vector = new Vector<>();
        start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            vector.add(i);
        }

        end = System.currentTimeMillis();
        System.out.println("Added " + size + " Elements to a Vector: " + (end - start) + "ms");

        // Multithreaded ArrayList approach
        //List<Integer> multithreadedList = new ArrayList<>();
        List<Integer> multithreadedList = Collections.synchronizedList(new ArrayList<>()); // will make it synchronized
        start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadedList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadedList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added elements in a multithreaded way to ArrayList: " + size + (end - start) + "ms");
        // ArrayList are not synchronized
        System.out.println("Size is: " + multithreadedList.size());

        // Multithreaded Vector approach
        List<Integer> multithreadedVector = new Vector<>();
        start = System.currentTimeMillis();
        t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadedVector.add(i);
            }
        });
        t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multithreadedVector.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added elements in a multithreaded way to Vector: " + size + (end - start) + "ms");
        // Vectors are thread-safe
        System.out.println("Size is: " + multithreadedVector.size());
    }
}
