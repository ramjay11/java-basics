package com.ramjava.java.basics.codemonkey;

public class Methods {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloTo("Dianne");
        int x = returnFive();
        System.out.println(x);
        int result = square(x);
        System.out.println(square(x));
        // f(x) = x * x
    }
    // this method both returns a value, and takes in data
    static int square(int x) {
        return x * x;
    }
    // this method returns an int type with value 5
    static int returnFive() {
        return 5;
    }
    // this method will say hello to whatever name is passed when called
    static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
    // this method simply says hello, world
    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}
