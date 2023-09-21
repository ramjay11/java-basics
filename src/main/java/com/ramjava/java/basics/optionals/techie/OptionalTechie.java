package com.ramjava.java.basics.optionals.techie;

import java.util.Arrays;
import java.util.Optional;

public class OptionalTechie {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Huskey", null, Arrays.asList("399994848",
                "897484749"));

        // 3 ways to create optional
        // empty, of, ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional2);
    }
}
