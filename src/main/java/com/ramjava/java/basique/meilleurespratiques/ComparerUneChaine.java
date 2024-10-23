package com.ramjava.java.basique.meilleurespratiques;

public class ComparerUneChaine {
    public static void main(String[] args) {
        String s1 = "String";
        String s2 = "String";
        String s3 = new String("String");

        System.out.println(" == operator result for s1 and s2: " + (s1 == s2));
        System.out.println(" == operator result for s1 and s3: " + (s1 == s3));
        System.out.println(" equals() method result for s1 and s2: " + s1.equals(s2));
        System.out.println(" equals() method result for s1 and s3: " + s1.equals(s3));
    }
}
