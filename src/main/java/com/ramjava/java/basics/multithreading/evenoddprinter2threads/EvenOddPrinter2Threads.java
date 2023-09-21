package com.ramjava.java.basics.multithreading.evenoddprinter2threads;

// multithreading (either implements Runnable, Callable or extend Thread)
public class EvenOddPrinter2Threads implements Runnable {
    static int count = 1;
    Object object;

    public EvenOddPrinter2Threads(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        // print up to 109
        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                // synchronize blocks of code one after the other
                synchronized (object) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName()
                    + " value: " + count);
                    // increase the count
                    count++;
                    try {
                        // inter-thread communication
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            // For odd numbers
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName()
                            + " value: " + count);
                    // increase the count
                    count++;
                    // notify once it's done
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        // 2 Runnable instance
        Runnable r1 = new EvenOddPrinter2Threads(lock);
        Runnable r2 = new EvenOddPrinter2Threads(lock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }

}
