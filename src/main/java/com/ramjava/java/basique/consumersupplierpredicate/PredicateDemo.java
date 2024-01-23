package com.ramjava.java.basique.consumersupplierpredicate;

import java.util.function.Predicate;

// Predicate could be used for conditional check
public class PredicateDemo {

    // Traditional way with implementation of Predicate<Integer>
//    @Override
//    public boolean test(Integer t) {
//        // Check if it's even or odd
//        if (t % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
//        Predicate<Integer> predicate = new PredicateDemo();
//        System.out.println(predicate.test(4));
        // Lambda way
        /*
        Predicate<Integer> predicate = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate.test(8));
        */
        // Single line lambda
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(8));
    }
}
