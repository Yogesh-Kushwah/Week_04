package com.nestedtrycatchtest;
import com.nestedtrycatch.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NestedTryCatchTest {

    @Test
    void testValidDivision() {
        int[] numbers = {10, 20, 30, 40, 50};
        int result = NestedTryCatch.divideElement(numbers, 2, 10);  // 30 / 10
        assertEquals(3, result, "30 divided by 10 should be 3");
    }

    @Test
    void testArrayIndexOutOfBounds() {
        int[] numbers = {10, 20, 30, 40, 50};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            NestedTryCatch.divideElement(numbers, 10, 2);  // Invalid index
        }, "Should throw ArrayIndexOutOfBoundsException for index 10");
    }

    @Test
    void testDivisionByZero() {
        int[] numbers = {10, 20, 30, 40, 50};
        assertThrows(ArithmeticException.class, () -> {
            NestedTryCatch.divideElement(numbers, 2, 0);  // Division by zero
        }, "Should throw ArithmeticException when dividing by zero");
    }

    @Test
    void testNullArray() {
        int[] numbers = null;
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            NestedTryCatch.divideElement(numbers, 0, 1);
        });
        assertEquals("Array is not initialized!", exception.getMessage(), "Exception message should be 'Array is not initialized!'");
    }
}
