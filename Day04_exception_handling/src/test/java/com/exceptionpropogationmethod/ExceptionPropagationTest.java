package com.exceptionpropogationmethod;

import com.exceptionpropogationinmethod.ExceptionPropagation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionPropagationTest {

    @Test
    void testMethod2ThrowsArithmeticException() {
        // Verifying that an ArithmeticException is thrown when method2() is called
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> ExceptionPropagation.method2());

        // Checking that the exception message contains "/ by zero"
        assertTrue(exception.getMessage().contains("/ by zero"), "Exception message should contain '/ by zero'");
    }
}
