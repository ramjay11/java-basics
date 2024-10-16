package com.ramjava.java.basique.fibonazi;

public class Fibonazi1 {

    // Memoization
    private static long[] fibonaziCache;
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        // Return the 6th fibonazi number
        int n = 50;
        fibonaziCache = new long[n + 1];
        System.out.println(fibonazi(n));

    }

    private static long fibonazi(int n) {
        // Base case preventing stack overflow
        if (n <= 1) {
            return n;
        }
        // Primitive can never be null
        if (fibonaziCache[n] != 0) {
            return fibonaziCache[n];
        }
        long nthFibonazi = fibonazi(n - 1) + fibonazi(n - 2);
        fibonaziCache[n] = nthFibonazi;
        return nthFibonazi;
        //return (fibonazi(n - 1) + fibonazi(n - 2));
    }
}
