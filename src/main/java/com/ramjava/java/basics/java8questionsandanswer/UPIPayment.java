package com.ramjava.java.basics.java8questionsandanswer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {
    // All methods of interface are public and abstract by default
    String doPayment(String source, String dest);
    //void test();
    /* Default method need to define its implementation, no restriction to overwrite default methods*/
    default double getScratchCard() {
        return new Random().nextDouble();
    }
    /* Static method, acts as a utility */
    static String datePatterns(String patterns) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }
}
