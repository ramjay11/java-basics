package com.ramjava.java.basique.recursion;

// Each cat has 2 eyes. Send the number of cats to a function and return the total number of eyes all cats have
public class CatsEyes {

    public static void main(String[] args) {
        System.out.println("Cat's eyes: " + catEyes(5));
    }

    public static int catEyes(int n) {
        // Base case
        if (n == 0) {
            return 0;
        } else {
            return 2 + catEyes(n - 1);
        }
    }
}
