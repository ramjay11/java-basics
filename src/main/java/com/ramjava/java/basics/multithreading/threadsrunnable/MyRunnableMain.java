package com.ramjava.java.basics.multithreading.threadsrunnable;

// Sequential - Work on 1 task at a time
// Concurrent - Working on multiple tasks at the same time. Example, Youtube is loading a video is 1 task, loading a comment is another task
// Parallelism - Task is split into subtasks which can be completed at the same time (in parallel)
// Concurrency - Working on more than 1 task at the same time
public class MyRunnableMain {
    public static void main(String[] args) {
        // The main thread
        //System.out.println(Thread.currentThread().getName());
        // all objects can be used to create instances of the Thread class. These instances will be separate threads to run task specified in run()
        MyRunnable myRunnable1 = new MyRunnable("Object 1");
        MyRunnable myRunnable2 = new MyRunnable("Object 2");
        MyRunnable myRunnable3 = new MyRunnable("Object 3");
        MyRunnable myRunnable4 = new MyRunnable("Object 4");

        // Execute each instances
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);
        Thread thread4 = new Thread(myRunnable4);

        // The start() method is used to begin the execution of a thread. The start() internally calls the run() which houses the task to be executed
        // Threads run independently of one another. They print at random because its the operating system that schedule the threads.
        // Synchronizing threads -
        // Practical usage of threads is for Network/Server-side programming
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
