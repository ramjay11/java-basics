package com.ramjava.java.basics.lambdabuffer;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }
    String name;
    int age;
    String email;
    Sex gender;

    public Person() {
    }

    public Person(String name, int age, String email, Sex gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    // List of Person
    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Huskey", 80, "huskey@yahoo.com", Sex.MALE));
        people.add(new Person("Blackey", 81, "blackey@yahoo.com", Sex.FEMALE));
        people.add(new Person("Siber", 82, "siber@yahoo.com", Sex.MALE));
        return people;
    }
}
