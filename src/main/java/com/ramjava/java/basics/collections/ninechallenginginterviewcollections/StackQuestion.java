package com.ramjava.java.basics.collections.ninechallenginginterviewcollections;

import java.util.Stack;

public class StackQuestion {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(new Integer(3));
        obj.push(new Integer(2));
        obj.pop();
        obj.push(5);
        System.out.println(obj);
    }
}
