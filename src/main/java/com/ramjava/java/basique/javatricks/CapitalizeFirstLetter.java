package com.ramjava.java.basique.javatricks;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String s = "Happy Birthday";
        //System.out.println(s.toUpperCase());
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(result);

    }
}
