package com.ramjava.java.basics.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        // Reflection to peak the structure of the cat class
        Cat myCat = new Cat("Blackey", 88);
        Field[] catFields = myCat.getClass().getDeclaredFields();
        for (Field field : catFields) {
            //System.out.println(field.getName());
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Blackey");
            }
        }
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method : catMethods) {
            //if (method.getName().equals("meow")) {
            if (method.getName().equals("heyThisIsPrivate")) {
                //method.invoke(myCat);
                method.setAccessible(true);
                method.invoke(myCat);
                myCat.meow(); // without the need of reflection
            }
            System.out.println(method.getName());
        }
        System.out.println(myCat.getName());
    }
}
