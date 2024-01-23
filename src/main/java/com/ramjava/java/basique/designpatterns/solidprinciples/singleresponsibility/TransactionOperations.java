package com.ramjava.java.basique.designpatterns.solidprinciples.singleresponsibility;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(BigDecimal amount, int accountNumber) {
        var accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        var accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
