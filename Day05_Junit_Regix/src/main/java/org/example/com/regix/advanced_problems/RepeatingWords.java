//1️⃣4️⃣ Find Repeating Words in a Sentence
//        🔹 Example Input:
//        "This is is a repeated repeated word test."
//        🔹 Expected Output:
//        is, repeated


package org.example.com.regix.advanced_problems.ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;

public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex to find repeating words
        String regex = "\\b(\\w+)\\b(\\s+\\1\\b)";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1)); // Store repeated words
        }

        // Print output with proper formatting
        System.out.println("Repeated words: " + String.join(", ", repeatedWords));
    }
}
