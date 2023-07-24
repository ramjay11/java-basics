package com.ramjava.java.basics.codemonkey;

public class ReferenceAndValueTypes {
    public static void main(String[] args) {
        int x = 5;
        addOneTo(x); // we're passing a copy of a value of x which is 5
        System.out.println(x);
        Person john;
        john = new Person("John"); // creating a new person object, assigning john to refer to it
        john.setAge(20); // passing the reference to a method which can use to be manipulated
        celebrateBirthday(john);
        System.out.println(john.getAge());
    }
    private static void celebrateBirthday(Person person) {
        person.setAge(person.getAge() + 1);
    }
    // manipulate of a copy the value passed
    static void addOneTo(int number) {
        number = number + 1;
    }

}
