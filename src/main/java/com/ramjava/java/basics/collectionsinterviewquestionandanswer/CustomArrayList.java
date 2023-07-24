package com.ramjava.java.basics.collectionsinterviewquestionandanswer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {
    // Will not allow duplicate
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);
        // Set does not Allow duplicate
        Set<Student> set = new HashSet<>();
        Student s1 = new Student(101, "Huskey");
        Student s2 = new Student(101, "Huskey");
        Student s3 = new Student(103, "Siber");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
