package org.example.com.regix.extraction.date_month;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMonth {

    public static void main(String[] args) {

        // Regex for extracting emails
        String regex = "\\d{2}/\\d{2}/\\d{4}";

        // Text containing email addresses
        String eventText = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(eventText);

        // Find and print all matched emails
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
