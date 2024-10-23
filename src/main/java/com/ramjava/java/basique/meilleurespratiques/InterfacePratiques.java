package com.ramjava.java.basique.meilleurespratiques;

/*
*  Code for interface, not for implementation
*  1. Use interface to define a contract
*  2. Always use interface type as reference type
*  3. Always use interface type as a return type
*  4. Always use interface type as a method parameter
* */

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class InterfacePratiques {
    public static void main(String[] args) {
        var shape = new Circle();
        printShape(shape);
    }

    private static void printShape(Shape shape) {
        shape.draw();
    }
}
