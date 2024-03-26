package com.ramjava.java.basique.annotations;

import java.lang.reflect.Method;

public class MainAnnotation {
    @MyCustomAnnotation(value = 11)
    public void sagHallo() {
        System.out.println("My Custom Annotation");
    }
    public static void main(String[] args) throws Exception {
        var ma = new MainAnnotation();
        Method method = ma.getClass().getMethod("sagHallo");

        MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is: " + myCustomAnnotation.value());
    }

}
