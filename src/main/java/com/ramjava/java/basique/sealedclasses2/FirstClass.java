package com.ramjava.java.basique.sealedclasses2;

// Subclass extending a sealed class should be either final, sealed or non-sealed
public sealed class FirstClass extends SampleSealedClass permits ThirdClass {
}
