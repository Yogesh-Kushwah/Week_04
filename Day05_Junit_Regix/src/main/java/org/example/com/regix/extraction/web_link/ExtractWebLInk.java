package org.example.com.regix.extraction.web_link;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWebLInk {

    public static void main(String[] args) {

        // Regex for extracting emails
        String regex = "(https?://)?(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Text containing email addresses
        String webText ="Visit https://www.google.com and http://example.org for more info.";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(webText);

        // Find and print all matched emails
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
