package com.ramjava.java.basics.lambdabuffer;

import java.util.List;

public class LambdaMain {

    @FunctionalInterface
    interface CheckPerson {
        // Takes Person as input parameter
        boolean test(Person p);
        //boolean test2(Person p);  It won't allow 2 abstract methods
    }

    // Eligible is Male and age is 80 to 81
    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson {

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE && p.getAge() >= 80 && p.getAge() <= 81;
        }
    }

    public static void printPersonOlderThan(List<Person> people, int age) {
        for (Person p : people) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPerson(List<Person> person, CheckPerson tester) {
        for (Person p : person) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonWithinAgeRange(List<Person> people, int low, int high) {
        for (Person p : people) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
    public static void main(String[] args) {
        //
        List<Person> person = Person.generateDefaultList();
        //printPersonOlderThan(person, 48);
        //printPersonWithinAgeRange(person, 80, 81);
        //printPerson(person, new CheckPersonEligibleForSelectiveSearch());

        // Anonymous class approach
        printPerson(person, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE && p.getAge() >= 80 && p.getAge() <= 81;
            }
        });

        // Lambda approach, only needs the input parameter and the implementation
        // Lambda only works with Functional Interfaces(1 abstract method)
        // If 1 statement {} could be omitted
        /*
        printPerson(person, (p) -> {
                return p.gender == Person.Sex.MALE && p.getAge() >= 80 && p.getAge() <= 81;
        });
        */
        printPerson(person, (p) -> p.gender == Person.Sex.MALE && p.getAge() >= 80 && p.getAge() <= 81);
    }
}
