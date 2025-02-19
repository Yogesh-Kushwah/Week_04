package org.example.com.regix.extraction.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFromText {
    public static void main(String[] args) {

        // Regex for extracting emails
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

        // Text containing email addresses
        String emailText = "Contact us at support@example.com and info@company.org";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(emailText);

        // Find and print all matched emails
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
