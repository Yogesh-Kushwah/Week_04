package org.example.banking_system;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{Number='" + accountNumber + "', Balance=" + balance + "}";
    }
}
