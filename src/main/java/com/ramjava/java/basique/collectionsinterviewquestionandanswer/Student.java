package com.ramjava.java.basique.collectionsinterviewquestionandanswer;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101, "Huskey");
        Student s2 = new Student(102, "Blackey");
        Student s3 = new Student(103, "Siber");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
    }
}
