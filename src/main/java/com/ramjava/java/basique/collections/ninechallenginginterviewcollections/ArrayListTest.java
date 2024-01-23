package com.ramjava.java.basique.collections.ninechallenginginterviewcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        // It will throw ConcurrentModificationException if you try to manipulate or add to the list while you're iterating it
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());
            arrayList.add("c");
        }
    }
}
