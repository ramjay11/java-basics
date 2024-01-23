package com.ramjava.java.basique.anonymousinnerclass;

// Anonymous inner class has no name and is used to instantiate 1 object. It's a one time use class
//
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        // Unnamed class of subclass animal
        Animal bigfoot = new Animal() {
            // anonymous class definition
            public void makeNoise() {
                System.out.println("Growl");
            }
        };
        bigfoot.makeNoise();
    }
}
