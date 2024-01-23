package com.ramjava.java.basique.designpatterns.behavioralpatterns.strategy_der;

public class Dog extends Animal {
    public void dighole() {
        System.out.println("Dug a hole");
    }
    public Dog() {
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }
}
