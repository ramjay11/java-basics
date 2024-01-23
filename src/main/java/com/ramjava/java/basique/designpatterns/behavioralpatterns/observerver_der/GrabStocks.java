package com.ramjava.java.basique.designpatterns.behavioralpatterns.observerver_der;

/* The Observer Pattern is a software design pattern in which an object called subject,
*  maintains a list of its dependents, called observers and notifies automatically any
*  state changes, usually by calling one of their methods*/
public class GrabStocks {
    public static void main(String[] args) {
        var stockGrabber = new StockGrabber();
        // Observer that will send updates from subjects/publisher
        var observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.00);
        stockGrabber.setGoogPrice(676.00);
    }
}
