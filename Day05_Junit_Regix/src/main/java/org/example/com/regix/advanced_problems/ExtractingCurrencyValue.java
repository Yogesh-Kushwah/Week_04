package org.example.com.regix.advanced_problems.ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingCurrencyValue {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Improved regex: Matches optional '$' followed by digits and optional decimal part
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean first = true; // To format the output properly

        System.out.print("Extracted currency values: ");
        while (matcher.find()) {
            if (!first) {
                System.out.print(", ");  // Add comma only after the first match
            }
            System.out.print(matcher.group());
            first = false;  // Update flag after the first match
        }
    }
}
