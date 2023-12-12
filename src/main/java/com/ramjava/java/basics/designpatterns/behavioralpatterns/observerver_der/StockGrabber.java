package com.ramjava.java.basics.designpatterns.behavioralpatterns.observerver_der;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    // Store all observers in an ArrayList
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        // Define the ArrayList
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        // Call the ArrayList to remove
        observers.remove(observerIndex);
    }
    // Cycles through all observers and notify them of any price change that occur
    @Override
    public void notifyObserver() {
        // Enhanced for loop
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }
    // This will notify all the observers after the prices are changed
    public void setIbmPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAaplPrice) {
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newgGoogPrice) {
        this.googPrice = newgGoogPrice;
        notifyObserver();
    }
}
