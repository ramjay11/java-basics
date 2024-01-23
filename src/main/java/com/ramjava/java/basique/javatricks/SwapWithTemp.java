package com.ramjava.java.basique.javatricks;

public class SwapWithTemp {
    public static void main(String[] args) {
        float first = 1.20f, second = 2.30f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temp = first;
        // Value of second is assigned to first
        first = second;
        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
