package com.ramjava.java.basique.designpatterns.behavioralpatterns.strategy_der;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
