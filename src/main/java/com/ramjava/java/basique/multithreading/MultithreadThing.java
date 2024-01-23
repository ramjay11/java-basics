package com.ramjava.java.basique.multithreading;

// Extending Thread makes it multithreading
public class MultithreadThing extends Thread {
    // Override run method to make it run in multiple thread
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            // Sleep every 1 second
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
