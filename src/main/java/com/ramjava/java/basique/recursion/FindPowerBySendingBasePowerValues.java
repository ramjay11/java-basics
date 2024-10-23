package com.ramjava.java.basique.recursion;

public class FindPowerBySendingBasePowerValues {
    public static void main(String[] args) {
        System.out.println(power(3, 3));
    }

    public static int power(int base, int power) {
        if (power == 1) {
            return base;
        } else {
            return base * power(base, power - 1);
        }
    }
}
