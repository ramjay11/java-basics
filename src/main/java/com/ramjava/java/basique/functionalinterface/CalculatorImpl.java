package com.ramjava.java.basique.functionalinterface;

interface Calculator {
    //void switchOn();
    void sum(int input);
}
public class CalculatorImpl {

//    @Override
//    public void switchOn() {
//
//    }

    public static void main(String[] args) {
        // Write Lambda expression for switchOn();
        // () parameter -> expression {} body
        //Calculator calculator = () -> System.out.println("Switch On"); // Bracket can be omitted if only one line
        Calculator calculator = (input) -> System.out.println("sum: " + input);
        calculator.sum(300);

    }

}
