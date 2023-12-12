package com.ramjava.java.basics.sealedclasses2;

// Subclass extending a sealed class should be either final, sealed or non-sealed
public sealed class FirstClass extends SampleSealedClass permits ThirdClass {
}
