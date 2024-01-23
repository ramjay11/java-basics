package com.ramjava.java.basique.test;

import java.util.Random;

/* Question: 1. Design a class called "BankAccount" with attributes accountNumber,
   accountHolderName, and balance. Account Number must start with 'RIA' followed by 7 random digits.
   Account Holder Name must not exceed 70 characters. Implement methods to deposit and withdraw money from the account.
* */
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName.substring(0, Math.min(accountHolderName.length(), 70));
        this.balance = 0.0;
    }

    private String generateAccountNumber() {
        var rand = new Random();
        var accountNumberBuilder = new StringBuilder("RIA");
        for (int i = 0; i < 7; i++) {
            accountNumberBuilder.append(rand.nextInt(10));
        }
        return accountNumberBuilder.toString();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited P"  + amount + " . New balance is P" + this.balance);
        } else {
            System.out.println("Invalid deposit amount, Amount must be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw P"  + amount + " . New balance is P" + this.balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount, Amount must be greater than 0");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Balance: P" + this.balance);
    }

    public static void main(String[] args) {
        var account = new BankAccount("Ramjay Romorosa");
        account.deposit(50000);
        // attempt to withdraw
        account.withdraw(11000);
        // attempt to withdraw more than the current balance
        account.withdraw(40000);
        // attempt to deposit a negative amount
        account.deposit(-100);
        account.displayAccountDetails();
        //displayAccountDetails();
    }
}
