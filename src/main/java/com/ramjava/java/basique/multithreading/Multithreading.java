package com.ramjava.java.basique.multithreading;

public class Multithreading {
    public static void main(String[] args) {
        // Run it in multithread
        /*
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();
        //myThing.run(); run method doesn't run concurrent threads
        myThing.start();
        myThing2.start();
        */
        // 5 threads running at the same time
        for (int i = 0; i <= 3; i++) {
            var myThing = new MultithreadThing();
            myThing.start();
        }
        //throw new RuntimeException();
    }
}
