package com.banktransactionsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTransactionSystemTest {

    // Testing the initial balance setup
    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount(1000.0);
        assertEquals(1000.0, account.getBalance(), "Checking if initial balance is set correctly");
    }

    // Testing a successful withdrawal
    @Test
    void testWithdrawSuccess() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000.0);
        account.withdraw(500.0);  // Withdrawing a valid amount
        assertEquals(500.0, account.getBalance(), "Checking if balance is updated after successful withdrawal");
    }

    // Testing withdrawal with insufficient balance
    @Test
    void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount(500.0);
        assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(600.0);  // Trying to withdraw more than the balance
        }, "Checking if InsufficientBalanceException is thrown when balance is insufficient");
    }

    // Testing withdrawal with a negative amount
    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(1000.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100.0);  // Trying to withdraw a negative amount
        }, "Checking if IllegalArgumentException is thrown for negative withdrawal amount");
    }

    // Testing initial balance with a negative value
    @Test
    void testInitialBalanceNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-1000.0);  // Creating an account with a negative initial balance
        }, "Checking if IllegalArgumentException is thrown for negative initial balance");
    }
}
