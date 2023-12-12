package com.ramjava.java.basics.test;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var bankAccount2 = new BankAccount2("Ramjay Romorosa", "123456" );
        bankAccount2.showMenu();
    }
}

class BankAccount2 {
    int balance;
    int previousTransaction;
    String customerName;
    String accountNumber;

    public BankAccount2(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    void deposit(int amount) {
        if (amount != 0) {
            // same as balance += amount
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            // same as balance += amount
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction)); // Convert to positive value
        } else {
            System.out.println("No transaction");
        }
    }

    void showMenu() {
        char option = '\0';
        var scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("=========================");
            System.out.println("Enter the option");
            System.out.println("=========================");
            option = scanner.next().charAt(0); // return first character of the string
            Character.toUpperCase(option); // will convert lowercase to uppercase
            switch (option) {
                case 'A' :
                    System.out.println("=========================");
                    System.out.println("Balance is: " + balance);
                    System.out.println("=========================");
                    System.out.println();
                    break;
                case 'B' :
                    System.out.println("=========================");
                    System.out.println("Enter amount to deposit: " + balance);
                    System.out.println("=========================");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C' :
                    System.out.println("=========================");
                    System.out.println("Enter amount to withdraw: " + balance);
                    System.out.println("=========================");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case 'D' :
                    System.out.println("=========================");
                    getPreviousTransaction();
                    System.out.println("=========================");
                    System.out.println();
                    break;
                case 'E' :
                    System.out.println("=========================");
                    System.out.println("Exiting!");
                    System.out.println("=========================");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (option != 'E');
    }
}
