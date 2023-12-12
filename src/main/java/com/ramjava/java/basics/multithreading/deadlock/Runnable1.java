package com.ramjava.java.basics.multithreading.deadlock;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable {
    private Lock lock1 = null;
    private Lock lock2 = null;

    public Runnable1(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {

    }
}
