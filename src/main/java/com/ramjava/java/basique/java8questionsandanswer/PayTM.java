package com.ramjava.java.basique.java8questionsandanswer;

public class PayTM implements UPIPayment {
    @Override
    public String doPayment(String source, String dest) {
        // static implementation act as a utility method
        String transactionDate = UPIPayment.datePatterns("yyyy-MM-dd");
        return null;
    }
    // Optional implementation
    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
