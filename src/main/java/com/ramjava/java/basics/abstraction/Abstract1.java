package com.ramjava.java.basics.abstraction;

interface DogInterface {
    // All methods in interface are abstract
    void bark();
    void run();
}

abstract class Dog {
    String breed;
    public void bark() {
        System.out.println("Barking!");
    }

    public abstract void run();
}

class Malinois extends Dog {
    // Malinois class already has what the Dog class had
    @Override
    public void run() {
        System.out.println("Dog running");
    }

}

public class Abstract1 {
    public static void main(String[] args) {
        // var d = new Dog(); you can't instantiate an abstract class
        //d.bark();
        var malinois = new Malinois();
        malinois.bark();
        //System.out.println(malinois.breed);
        malinois.run();

    }
}
