package com.ramjava.java.basique.test2;

import java.util.Objects;
/*
* the equals() and hashCode() methods are part of the Object class, and they play a crucial role in defining the contract for handling object equality.
* */
public class EqualsHashCode {
    private int id;
    private String name;

    // Constructor
    public EqualsHashCode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EqualsHashCode myObject = (EqualsHashCode) obj;
        return id == myObject.id && Objects.equals(name, myObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        // Instantiate objects for testing
        var obj1 = new EqualsHashCode(1, "Siber");
        var obj2 = new EqualsHashCode(1, "Siber");
        var obj3 = new EqualsHashCode(2, "Doray");

        // Test the equals method
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));  // Should print true
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3));  // Should print false

        // Test the hashCode method
        System.out.println("HashCode of obj1: " + obj1.hashCode());
        System.out.println("HashCode of obj2: " + obj2.hashCode());
        System.out.println("HashCode of obj3: " + obj3.hashCode());
    }
}
