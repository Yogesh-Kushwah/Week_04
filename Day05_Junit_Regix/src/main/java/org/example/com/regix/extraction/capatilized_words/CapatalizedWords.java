package org.example.com.regix.extraction.capatilized_words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapatalizedWords {

    public static void main(String[] args) {

        // Regex for extracting emails
        String regex = "[A-Z][a-z]*";

        // Text containing email addresses
        String capitalizeText = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(capitalizeText);

        // Find and print all matched emails
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
