package com.ramjava.java.basics.sealedclasses2;

/*
 * What is Sealed Class?
 * - Declaring a class that can be inherited by only specific subclasses
 * - Before Java 17, inheritance was an "all or nothing"
 * - Sealed Class enable you to specify precisely what subclasses a superclass will allow
 *
 * */
public sealed class SampleSealedClass permits FirstClass, SecondClass {
}
