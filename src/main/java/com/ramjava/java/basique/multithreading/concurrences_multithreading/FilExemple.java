package com.ramjava.java.basique.multithreading.concurrences_multithreading;

/*
Multithreading:
 Definition: Multithreading is a programming concept where multiple threads run in a shared environment, allowing for concurrent execution of tasks.
 Usage: In Java, multithreading is typically achieved by creating and running multiple threads in a program. A thread is the smallest unit of execution within a process.
 Mechanism: Java supports multithreading primarily through the Thread class and the Runnable interface. You can create threads by extending the Thread class or implementing
 the Runnable interface.
 Drawback: Extending the Thread class limits the flexibility of your class since Java supports only single inheritance. Therefore,
 it's often recommended to use the Runnable interface instead.
*/
public class FilExemple {
    public static void main(String[] args) {
        /*
        var thread = new Thread();
        thread.start();
        */
        var r = new ImplementRunnable();
        var t1 = new Thread(r);
        t1.start();

        var et1 = new ExtendsThread();
        et1.start();
    }
}
/*
* Runnable:
   Definition: Runnable is an interface in Java that represents a task that can be executed concurrently by multiple threads.
   Usage: It is used as an alternative to extending the Thread class. By implementing the Runnable interface, a class can define its thread behavior without the limitations
   of single inheritance.
   Mechanism: The Runnable interface has a single abstract method called run(), which defines the code that will be executed in the new thread.
   While multithreading is the broader concept of concurrent execution involving multiple threads, the Runnable interface is a specific mechanism in Java for defining
   the code that will be executed concurrently. Using Runnable is often preferred over extending the Thread class because it allows for better design flexibility.
* */
class ImplementRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Implements Runnable!");
    }
}

class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("Extends Thread");
    }
}