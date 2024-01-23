package com.ramjava.java.basique.finals;

public class Final {
    //final int MAX;
    final int MAX =5;

    /*
    public Final() {
        this.MAX = 5;
    }
    */

    /*
    void changeMax() {
        //MAX = newMAX;
    }
    */

    public static void main(String[] args) {
        var f = new Final();
        System.out.println(f.MAX);
    }
}
