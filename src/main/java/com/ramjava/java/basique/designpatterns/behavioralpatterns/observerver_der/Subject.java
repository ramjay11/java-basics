package com.ramjava.java.basique.designpatterns.behavioralpatterns.observerver_der;

// The object(subject or publisher) will handle the adding, deleting and updating
// of all observers(dependents)
public interface Subject {
    public void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
