package com.ramjava.java.basics.designpatterns.creationalpatterns.singleton_telusko;

public class SingletonTelusko {
    public static void main(String[] args) {
        //Abc obj1 = new Abc();
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
    public static Abc getInstance() {
        return obj;
    }
}
