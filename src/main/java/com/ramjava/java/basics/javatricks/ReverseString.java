package com.ramjava.java.basics.javatricks;

public class ReverseString {
    public static void main(String[] args) {
        String r = reverse("dog");
        System.out.println(r);
    }


    public static String reverse(String s) {
        // Store each character as an array
        char[] letters = new char[s.length()]; // String s is "dog"
        int letterIndex = 0; // Index starts at 0
        //for (int i = 0; i < s.length(); i++) {
        // to reverse, start i at the last index of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            //System.out.println(s.charAt(i));
            // store it to letters char[] array
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        // All characters now at backward order and would put on the variable String reverse
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
