package com.ramjava.java.basics.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//
//public class SupplierDemo implements Supplier<LocalDateTime> {
public class SupplierDemo  {
    /*
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
    */

    public static void main(String[] args) {
        /*
        Supplier<LocalDateTime> supplier = new SupplierDemo();
        System.out.println(supplier.get());
        */

        // Use Lambda (Use Anonymous implementation of Supplier Interface)
        Supplier<LocalDateTime> supplier = new Supplier<LocalDateTime>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };
        System.out.println(supplier.get());
    }
}
