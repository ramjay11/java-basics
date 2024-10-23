package com.ramjava.java.basique.meilleurespratiques;

import java.util.ArrayList;
import java.util.List;

public class LambdaAnonymous {
    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList<>();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
