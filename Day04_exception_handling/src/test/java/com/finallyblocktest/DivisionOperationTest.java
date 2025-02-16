package com.finallyblocktest;

import com.finallyblock.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionOperationTest {

    @Test
    void testValidDivision() {
        // Testing division with valid input
        int result = DivisionOperation.divide(10, 2);
        assertEquals(5, result, "The result should be 5");
    }

    @Test
    void testDivisionByZero() {
        // Testing division by zero, expecting ArithmeticException
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            DivisionOperation.divide(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage(), "Exception message should be '/ by zero'");
    }

    @Test
    void testFinallyBlockExecution() {
        // Using a flag to check if finally block executes
        boolean finallyExecuted = false;

        try {
            DivisionOperation.divide(10, 0);
        } catch (ArithmeticException e) {
            // Ignoring exception for this test
        } finally {
            finallyExecuted = true;
        }

        assertTrue(finallyExecuted, "Finally block should always execute");
    }
}
