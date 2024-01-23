package com.ramjava.java.basique.abstraction;

/*Inheritance is a fundamental concept in object-oriented programming (OOP) and Java12. It allows one class to inherit the features (fields and methods) of another
  class.
  Why Use Inheritance?: The main benefits of using inheritance in Java are code reusability, method overriding, and abstraction12. Code written in the superclass
  is common to all subclasses, and child classes can directly use the parent class code12. Method overriding is achievable only through inheritance and is one of
  the ways by which Java achieves runtime polymorphism12. Abstraction only shows the functionality to the user
*/
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
