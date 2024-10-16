package com.ramjava.java.basique.recursion;

public class PrintFrom5To1 {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }
}
