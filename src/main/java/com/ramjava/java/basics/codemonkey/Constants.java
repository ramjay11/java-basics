package com.ramjava.java.basics.codemonkey;

public class Constants {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final Person P1 = new Person("");
    public static final int NUM_ENEMIES = 5;

    // constants never change once value is assigned
    // usually static
    // by convention, constants are upper case
    // declare constants by using  the "final" modifier
    // constants can be declared public since there's no harm in accessing variables directly
    public static void main(String[] args) {
        System.out.println(WIDTH);
        System.out.println(Math.PI);
    }
}