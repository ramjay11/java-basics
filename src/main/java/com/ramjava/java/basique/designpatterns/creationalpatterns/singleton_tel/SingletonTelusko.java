package com.ramjava.java.basique.designpatterns.creationalpatterns.singleton_tel;

public class SingletonTelusko {
    public static void main(String[] args) {
        //Abc obj1 = new Abc();
        // The main method demonstrates the usage by obtaining the instance of Abc using the getInstance() method.
        // Both obj2 and obj3 reference the same instance of the Abc class
        Abc obj2 = Abc.getInstance();
        Abc obj3 = Abc.getInstance();
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

// Only allowed to create 1 instance
class Abc {
    // 1st step is to create instance
    static Abc obj = new Abc();
    // 2nd is to create a private constructor
    private Abc() {}
    // 3rd is to create a static getInstance of the class
    // Static Method will retrieve the instance
    public static Abc getInstance() {
        return obj;
    }
}
