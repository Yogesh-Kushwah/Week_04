package com.checkedexception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class CheckedExceptionTest {

    @Test
    void testFileExists() {
        // Checking if the file exists
        File file = new File("src/main/java/com/checkedexception/data.txt");
        assertTrue(file.exists(), "File should exist");
    }

    @Test
    void testFileReading() {
        // Reading the file and checking its content
        File file = new File("src/main/java/com/checkedexception/data.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            assertNotNull(line, "File should contain at least one line");
        } catch (IOException e) {
            fail("IOException should not be thrown");
        }
    }

    @Test
    void testFileNotFound() {
        // Testing behavior when the file does not exist
        File file = new File("src/main/java/com/checkedexception/nonexistent.txt");
        IOException exception = assertThrows(IOException.class, () -> {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine();
            }
        });
        assertNotNull(exception.getMessage(), "IOException should be thrown with a message");
    }
}
