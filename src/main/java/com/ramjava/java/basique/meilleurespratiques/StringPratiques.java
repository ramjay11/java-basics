package com.ramjava.java.basique.meilleurespratiques;

public class StringPratiques {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            str = str + i;
        }
        long endTime = System.nanoTime();
        System.out.printf("String operation with operator took [%d] nano seconds%n",
                (endTime - startTime));

        var builder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        endTime = System.nanoTime();
        System.out.printf("String operation with StringBuilder took [%d] nano seconds%n",
                (endTime - startTime));

        var buffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            buffer.append(i);
        }
        endTime = System.nanoTime();
        System.out.printf("String operation with StringBuffer took [%d] nano seconds%n",
                (endTime - startTime));
    }
}
