package org.example.map_interface.word_frequency_counter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase();

                // Split by whitespace
                String[] words = line.split(" ");

                // Count word frequency
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String filePath = "C:/Users/udit0/OneDrive/Documents/CapgeminiTraining/Assignments/Week4/Day02/src/main/java/org/example/map_interface/word_frequency_counter/input.txt";
        Map<String, Integer> frequencyMap = countWordFrequency(filePath);

        // Print word frequencies
        System.out.println(frequencyMap);
    }
}
