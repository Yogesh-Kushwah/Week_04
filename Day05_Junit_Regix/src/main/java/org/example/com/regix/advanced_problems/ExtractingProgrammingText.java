package org.example.com.regix.advanced_problems.ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingProgrammingText {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex = "\\b[A-Z][a-zA-Z]+\\b";  // Fixed regex to ensure full words are matched

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true; // To handle comma formatting correctly

        System.out.print("Extracted languages: ");
        while (matcher.find()) {
            if (!first) {
                System.out.print(", ");  // Add comma only after the first match
            }
            System.out.print(matcher.group());
            first = false;  // Update flag after the first word
        }
    }
}
