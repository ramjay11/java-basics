package com.ramjava.java.basique.optionals;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Blackey");
//        if (myCat != null) {
//            System.out.println(myCat.getAge());
//        } else {
//            System.out.println(0);
//        }

//        if (optionalCat.isPresent()) {
//            System.out.println(optionalCat.get().getAge());
//        } else {
//            System.out.println(0);
//        }

        //Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));
        // You can pass a Lambda Supplier option
        //Cat myCat = optionalCat.orElseGet();
        optionalCat.map(Cat::getAge)
                .orElse(0);



    }
    // An Optionals is a better way to handle where method might not have something to return
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        // can either be null or not, if you're sure it's not null, you can use Optional.of
        return Optional.ofNullable(cat);
    }
}
