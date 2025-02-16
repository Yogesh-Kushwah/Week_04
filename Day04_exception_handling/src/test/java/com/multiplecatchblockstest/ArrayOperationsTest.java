package com.multiplecatchblockstest;
import com.multiplecatchblocks.ArrayOperations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {

    @Test
    void testValidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        int value = ArrayOperations.getValueAtIndex(array, 2);
        assertEquals(3, value, "Value at index 2 should be 3");
    }

    @Test
    void testArrayIndexOutOfBounds() {
        int[] array = {1, 2, 3, 4, 5};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayOperations.getValueAtIndex(array, 10);
        }, "Should throw ArrayIndexOutOfBoundsException for index 10");
    }

    @Test
    void testNullArray() {
        int[] array = null;
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            ArrayOperations.getValueAtIndex(array, 0);
        }, "should throw NullPointerException.");
    }
}

