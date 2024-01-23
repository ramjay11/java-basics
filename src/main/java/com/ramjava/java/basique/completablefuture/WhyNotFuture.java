package com.ramjava.java.basique.completablefuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class WhyNotFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            //delay(1);
            return Arrays.asList(1, 2, 3, 4);
        });

        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            //delay(1);
            return Arrays.asList(1, 2, 3, 4);
        });

        // Can't combine futures (future1.future2.future3)

        List<Integer> list = future1.get();
        System.out.println(list);

        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get(); // Thread will still be blocked
        completableFuture.complete("return some data"); // Manually complete the thread
    }

    public static void delay(int min) {
        try {
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
