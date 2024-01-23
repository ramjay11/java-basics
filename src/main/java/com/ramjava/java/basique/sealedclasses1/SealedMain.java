package com.ramjava.java.basique.sealedclasses1;

sealed class A permits B, C {

}

non-sealed class B extends A {

}

final class C extends A {

}
class D extends B {

}
// Interface cannot be final
//sealed interface X permits Y {}
//sealed interface Y extends X {}
public class SealedMain {
    public static void main(String[] args) {

    }
}
