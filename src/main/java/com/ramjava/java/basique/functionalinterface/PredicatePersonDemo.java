package com.ramjava.java.basique.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
Predicate is a functional interface introduced in the Java 8 java.util.function package. It represents a predicate—a boolean-valued function of one argument.
The primary purpose of a Predicate is to test or check a condition and return a boolean result.
The Predicate interface declares a single abstract method called test(T t), where T is the type of the input argument. The test method takes an argument and
returns true or false based on whether the specified condition is satisfied.
Predicate interfaces are commonly used in various scenarios, such as filtering collections, validating data, or defining conditions for stream operations.
It provides a way to express conditions in a functional and concise manner.
* */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class PredicatePersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Huskey", 81);
        Person person2 = new Person("Saint", 72);
        Person person3 = new Person("Blackey", 92);
        Person person4 = new Person("Siber", 64);

        // Arrays.asList will convert object and store into collection
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);
        // Take list of persons and print persons whose age is >= 88
        Predicate<Person> predicate = p -> p.age >= 88;
        // Filtering and printing persons based on the defined Predicate
        for (Person person : persons) {
            if (predicate.test(person)) {
                System.out.println(person.name);
            }
        }
    }
}
