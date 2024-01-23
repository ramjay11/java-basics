package com.ramjava.java.basique.codemonkey;

public class Conditionals {
    public static void main(String[] args) {
        // If (some expression that evaluate to true)
        // do something
        boolean sayHello = false;
        boolean sayHey = true;

        if (sayHello) {
            System.out.println("Hello");
        } else if (sayHey) {
            System.out.println("Hey");
        } else {
            System.out.println("Goodbye");
        }

        int playerX = 50;
        if (true && false) {
            System.out.println("AND executed");
        }
        if (playerX < 0 || playerX > 800) {
            System.out.println("OR executed");
        } else {
            System.out.println("YEAH executed");
        }
    }
}