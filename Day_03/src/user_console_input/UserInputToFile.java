package user_console_input;

import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {
        // Create a BufferedReader to read user input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Define the file path where the data will be saved
        String filePath = "src/user_console_input/UserInputFile.txt";

        try {
            // Prompt the user for their name
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Prompt the user for their age
            System.out.print("Enter your age: ");
            String age = reader.readLine();

            // Prompt the user for their favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write the data to the file
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write("Name: " + name + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("Favorite Programming Language: " + language + "\n");
                System.out.println("Data saved to " + filePath);
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        } finally {
            try {
                reader.close(); // Close the BufferedReader
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }
        }
    }
}