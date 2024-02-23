package com.ramjava.java.basique.abstraction;

// Abstract class and abstract methods
public class AbstractTel {
    public static void main(String[] args) {
        //var siberPhone1 = new SiberPhone(); // Can't instantiate abstract class
        //siberPhone1.call();
        SiberPhone siberPhone2 = new BlackeyPhone();
        siberPhone2.call();
        siberPhone2.playBass();
        siberPhone2.playGuitar();
        siberPhone2.playDrums();
    }
}

abstract class SiberPhone {
    public void call() {
        System.out.println("calling....");
    }
    // If you don't want to provide implementation, make it abstract
    public abstract void playBass();
    public abstract void playGuitar();
    public abstract void playDrums();
}

abstract class DorayPhone extends SiberPhone {
    // public void call() {} is not mandatory to be implemented
    public void move() {
        System.out.println("moving....");
    }
//    @Override
//    public void playBass() {
//
//    }
//
//    @Override
//    public void playGuitar() {
//
//    }
//
//    @Override
//    public void playDrums() {
//
//    }
}

// Concrete class
class BlackeyPhone extends DorayPhone {

    @Override
    public void playBass() {
        System.out.println("Bass.....");
    }

    @Override
    public void playGuitar() {
        System.out.println("Guitar.....");
    }

    @Override
    public void playDrums() {
        System.out.println("Drums.....");
    }
}