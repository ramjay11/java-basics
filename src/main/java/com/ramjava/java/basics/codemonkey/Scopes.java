package com.ramjava.java.basics.codemonkey;

public class Scopes {
    // because x is declared outside any method. It is in scope to all method any methods can access x
    static int x; // declaring the variable x also known as class variable
    public static void main(String[] args) {
        //x = 5; // assigning a value to x
        System.out.println(x);
        int d = doSomething();
        System.out.println(x);
        System.out.println(d);
    }
    static int doSomething(){
        x = 10; // assigning a value to x
        return 8;
    }
    static void doSomethingLocally(){
        // because y is declared inside of this method, it is local to this method
        int y = 100; // declaring and initializing the variable y also as local variable
    }
}
