package com.ramjava.java.basique.recursion;

public class Fibonazi1 {
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        // Return the 6th fibonazi number
        System.out.println(fibonazi(6));
    }

    public static int fibonazi(int n) {
        // Double base case
        if (n == 0) {
            return 0;
        } if (n == 1) {
            return 1;
        } else {
            return fibonazi(n - 1) + fibonazi(n - 2);
        }
    }
}
