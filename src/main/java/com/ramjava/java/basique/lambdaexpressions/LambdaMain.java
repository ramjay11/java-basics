package com.ramjava.java.basique.lambdaexpressions;

public class LambdaMain {
    // Lambda can only work in functional interface
    // If you have an interface that have more than 1 abstract method, you could use anonymous class
    public static void main(String[] args) {
        //Cat myCat = new Cat();
        //myCat.print();
       // printThing(myCat);
        //printThing(() -> System.out.println("Meow"));
        Printable lambdaPrintable = (s) -> System.out.println("Meow " + s);
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
