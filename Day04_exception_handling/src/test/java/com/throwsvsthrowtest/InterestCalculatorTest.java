package com.throwsvsthrowtest;

import com.throwsvsthrow.InterestCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterestCalculatorTest {

    @Test
    void testValidInterestCalculation() {
        // Verifying the correct calculation of interest
        double interest = InterestCalculator.calculateInterest(1000, 5, 2);  // 1000 * 5 * 2 / 100
        assertEquals(100.0, interest, "Interest should be 100.0 for valid inputs.");
    }

    @Test
    void testNegativeAmountThrowsException() {
        // Verifying that IllegalArgumentException is thrown for negative amount
        assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(-1000, 5, 2);
        }, "IllegalArgumentException should be thrown for negative amount.");
    }

    @Test
    void testNegativeRateThrowsException() {
        // Verifying that IllegalArgumentException is thrown for negative rate
        assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(1000, -5, 2);
        }, "IllegalArgumentException should be thrown for negative rate.");
    }

    @Test
    void testZeroYears() {
        // Verifying that interest is 0 when years is 0
        double interest = InterestCalculator.calculateInterest(1000, 5, 0);
        assertEquals(0.0, interest,  "Interest should be 0 when years is 0.");
    }
}

