package com.ramjava.java.basique.multithreading.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TimeOutAThread {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        // 1. Start the task
        threadPool.submit(() -> {
            // tasks
            // ...
        });

        // 2. TODO: timeout for 10 minutes

        // 3. stop the thread (by shutting down the pool)
        /*
        *  shutDown()
        *   1. No new tasks accepted
        *   2. Previously submitted tasks are executed
        *  shutdownDownNow()
        *   1. No new tasks accepted
        *   2. Previously submitted tasks waiting in  the queue are returned
        *   3. Tasks being run by the thread(s) are attempted to stop
        * */
        threadPool.shutdown();
        threadPool.shutdownNow();
        // ---- Another option is callable
        // 1. Start the task
        Future<?> future = threadPool.submit(() -> {
            // Callable task
            // ....
        });

        // 2. TODO: timeout for 10 minutes

        // Stop the thread (by cancelling the future)
        future.cancel(true); // only attempts to stop the thread
    }
}
