package com.ramjava.java.basics.multithreading.threadsrunnable;

public class MyRunnable implements Runnable {
    private String objName;

    public MyRunnable(String objName) {
        this.objName = objName;
    }
    // Entry point to a new thread
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(objName);
        }
    }
}
