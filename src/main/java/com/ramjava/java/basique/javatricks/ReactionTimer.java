package com.ramjava.java.basique.javatricks;

import java.util.Scanner;

public class ReactionTimer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000); // Put delay of 1 second
        System.out.println("2");
        Thread.sleep(1000); // Put delay of 1 second
        System.out.println("1");
        Thread.sleep(1000); // Put delay of 1 second

        System.out.println("GO!!!!!");
        long startTime = System.currentTimeMillis();

        // User input
        Scanner s = new Scanner(System.in);
        // a = s.next();
        //System.out.println(a);
        s.next();
        long stopTime = System.currentTimeMillis();
        long reactionTime = startTime - stopTime;
        System.out.println(reactionTime + "ms");
    }
}
