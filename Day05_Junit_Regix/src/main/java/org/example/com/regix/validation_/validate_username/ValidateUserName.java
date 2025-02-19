package org.example.com.regix.validation_.validate_username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args) {

        // Regex for username validation
        String regex = "^[a-zA-Z]{3,10}_[0-9]{2,5}$";

        // Sample usernames to test
        String[] usernames = {"Yogesh_123", "Nil234", "123Adarsh"};

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
