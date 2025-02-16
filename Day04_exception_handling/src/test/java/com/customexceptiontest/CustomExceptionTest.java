package com.customexceptiontest;

import com.customexception.CustomException;
import com.customexception.InvalidAgeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomExceptionTest {

    @Test
    void testValidAge() {
        // Testing with a valid age (>= 18)
        assertDoesNotThrow(() -> CustomException.validateAge(20), "Age 20 should not throw an exception");
    }

    @Test
    void testInvalidAge() {
        // Testing with an invalid age (< 18)
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> {
            CustomException.validateAge(16);
        });
        assertEquals("Age must be 18 or above.", exception.getMessage(), "Exception message should match");
    }

    @Test
    void testBoundaryAge() {
        // Testing with the boundary age (18)
        assertDoesNotThrow(() -> CustomException.validateAge(18), "Age 18 should not throw an exception");
    }
}
