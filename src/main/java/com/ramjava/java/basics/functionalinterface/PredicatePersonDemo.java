package com.ramjava.java.basics.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
        // Take list of persons and print persons whose age is >= 92
        Predicate<Person> predicate = p -> p.age >= 88;
        for (Person person : persons) {
            if (predicate.test(person)) {
                System.out.println(person.name);
            }
        }
    }
}
