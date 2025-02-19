package org.example.com.regix.validation_.hex_color_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {


        // Regex for username validation
        String regex = "^[#][a-fA-f0-9]{6}$";

        // Sample usernames to test
        String[] usernames = {"#FFA500","#ff4500", "#123"};

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
