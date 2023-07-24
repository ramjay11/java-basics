package com.ramjava.java.basics.consumersupplierpredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Bypass the implements Consumer<Integer> in the class signature
public class ConsumerDemo {
    public static void main(String[] args) {
        // Anonymous class lambda expression
        /*Consumer<Integer> consumer = t -> System.out.println("Printing: " + t);
        // call the method
        consumer.accept(10);*/

        // List of integers
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        // forEach internally use the Consumer Functional Interface
        list1.stream().forEach( t -> System.out.println("Print : " + t));
    }
}
