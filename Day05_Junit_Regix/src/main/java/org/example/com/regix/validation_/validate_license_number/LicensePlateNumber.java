package org.example.com.regix.validation_.validate_license_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {


        // Regex for username validation
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // Sample usernames to test
        String[] usernames = {"AB1234", "NI4234", "A12345"};

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Check each username
        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);

            if (matcher.matches()) {
                System.out.println(username + " → ✅ Valid Username");
            } else {
                System.out.println(username + " → ❌ Invalid Username");
            }
        }

    }
}
