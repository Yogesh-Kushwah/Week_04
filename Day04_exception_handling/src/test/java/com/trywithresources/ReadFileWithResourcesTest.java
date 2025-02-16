package com.trywithresources;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class ReadFileWithResourcesTest {

    @Test
    void testFileWithContent() throws IOException {
        // Create a temporary file with content
        File tempFile = File.createTempFile("testFile", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello, this is a test file.");
        }

        // Read the temporary file
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile))) {
            String firstLine = reader.readLine();
            assertEquals("Hello, this is a test file.", firstLine, "First line should match the written content.");
        } finally {
            // Delete the temporary file
            tempFile.delete();
        }
    }

    @Test
    void testEmptyFile() throws IOException {
        // Create an empty temporary file
        File tempFile = File.createTempFile("emptyFile", ".txt");

        // Read the temporary file
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile))) {
            String firstLine = reader.readLine();
            assertNull(firstLine, "First line should be null for an empty file.");
        } finally {
            // Delete the temporary file
            tempFile.delete();
        }
    }

    @Test
    void testFileNotFound() {
        // Attempting to read a non-existent file
        Exception exception = assertThrows(IOException.class, () -> {
            try (BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"))) {
                reader.readLine();
            }
        });

        assertTrue(exception.getMessage().contains("non_existent_file.txt"), "Exception message should contain the file name.");
    }
}
