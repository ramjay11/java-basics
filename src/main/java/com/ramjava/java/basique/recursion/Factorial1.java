package com.ramjava.java.basique.recursion;

public class Factorial1 {
    // 5! = 5 * 4 * 3 * 2 * 1
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
