package com.ramjava.java.basics.collections.ninechallenginginterviewcollections;

import java.util.Arrays;

public class ArrayQuestion {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //for (int i = 5; i >= 0; i--) {
        //array[5-i] = i;
        //System.out.println(array[i]);
        /*
         * for (int arr : array) { System.out.println(array[i]); }
         */
        //}
        Arrays.fill(array, 1, 4, 8);
        for (int i = 0; i < 5; i++) {
            //System.out.println(array[i]);
        }
    }
}
