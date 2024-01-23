package com.ramjava.java.basique.designpatterns.solidprinciples.singleresponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.setAccountNumber(888);
        account.setFirstName("Siber");
        account.setTotalAmount(BigDecimal.valueOf(100000));
        var accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        var transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(888),888);
    }
}
