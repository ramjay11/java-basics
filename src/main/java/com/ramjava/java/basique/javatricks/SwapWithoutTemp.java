package com.ramjava.java.basique.javatricks;

public class SwapWithoutTemp {
    // Simple mathematics to swap the numbers.
    public static void main(String[] args) {
        float first = 12.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        // (first - second) is stored in variable first (first = 12.0f - 24.5f)
        first = first - second;
        // Add second (24.5f) to this number - calculated first (12.0f - 24.5f) to swap the number
        // Second = (12.0f - 24.5f) + 24.5f = 12.0f
        second = first + second;
        // Second holds 12.0f (which was initially value of first). Subtract calculated first (12.0f - 24.5f)
        // from swapped second (12.0f) to get the other swapped number.
        // first = 12.0f - (12.0f - 24.5f) = 24.5f
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }

}
