package com.ramjava.java.basics.codemonkey;

public class AccessModifiers {
    // private is most restrictive
    // default
    // protected
    // public
    public static void main(String[] args) {
    }
    // can be accessed anywhere in the program as long as an you can call instance of this class
    public void doSomethingPublic() {
    }
    // only accessed within the class
    private void doSomethingPrivate() {

    }
    // can only be accessed inside the package and subclasses of this class
    protected void doSomethingProtected() {

    }
    // default can only be accessed within the package
    void doSomething() {

    }
}
