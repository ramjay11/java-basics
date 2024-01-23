package com.ramjava.java.basique.lambdafuhrung;

interface Printable {
    void print(String msg);
}

public class LambdaSingleParameter {
    public static void main(String[] args) {
        // Without lambda expression
        var printable = new Printable() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printable.print("Print message to console...");

        // With lambda
        Printable withLambda = (msg) -> System.out.println(msg);
        withLambda.print("Print message to console...");
    }
}
