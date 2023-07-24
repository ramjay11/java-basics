package com.ramjava.java.basics.codemonkey;

public class Loops {
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
    }
    static void whileLoop() {
        int counter = 0;
        while(counter < 9) {
            //counter = counter + 1;
            counter++;
            System.out.print(counter + ", " );
        }
        System.out.print("10.");
        System.out.println();
    }
    static void doWhileLoop() {
        int counter = 0;
        do {
            counter = counter + 1;
            System.out.print(counter);
        } while(counter < 10);
        System.out.println();
    }
    static void forLoop() {
        for(int counter = 1; counter <= 10; counter = counter + 1) {
            System.out.println(counter);
        }
    }
}
