package org.example.banking_system;

public class BankingSystemMain {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        
        // Adding accounts
        bank.addAccount("A1001", 5000.00);
        bank.addAccount("A1002", 1200.00);
        bank.addAccount("A1003", 8000.00);
        
        // Request withdrawals
        bank.requestWithdrawal("A1001");
        bank.requestWithdrawal("A1002");
        
        // Process withdrawals
        bank.processWithdrawals(1000.00);
        
        // Display accounts sorted by balance
        bank.displaySortedAccounts();
    }
}
