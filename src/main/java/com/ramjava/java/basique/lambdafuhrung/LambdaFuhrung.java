package com.ramjava.java.basique.lambdafuhrung;

interface Shape {
    // Standardmäßig sind Schnittstellen öffentlich abstrakt
    void shape();
}

class Rectangle implements Shape {

    // Traditional OOP Polymorphism
    @Override
    public void shape() {
        System.out.println("Rechteck gezeichnet");
    }
}

class Square implements Shape {

    @Override
    public void shape() {
        System.out.println("Quadratisch gezeichnet");
    }
}

class Circle implements Shape {

    @Override
    public void shape() {
        System.out.println("Kreis gezeichnet");
    }
}

public class LambdaFuhrung {

    public static void main(String[] args) {
        // Convert to Functional Programming through Lambda
        // Lambda is an anonymous function. If one statement, omit {}
        String str = "Hallo";
        Shape rectangle = () -> System.out.println("Rechteck gezeichnet");
        rectangle.shape();
    }
}
