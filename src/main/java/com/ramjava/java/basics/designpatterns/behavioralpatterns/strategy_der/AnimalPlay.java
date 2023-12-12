package com.ramjava.java.basics.designpatterns.behavioralpatterns.strategy_der;

/* Define a family of algorithms, encapsulate each one, and make them interchangeable.
The Strategy Pattern lets the algorithm vary independently of clients that use it. */
public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();
        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

    }

}
