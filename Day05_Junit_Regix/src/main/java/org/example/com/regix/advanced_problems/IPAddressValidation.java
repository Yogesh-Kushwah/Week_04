package org.example.com.regix.advanced_problems.ip_address;

public class IPAddressValidation {
    public static void main(String[] args) {
        // Correct regex for validating IPv4 addresses (0-255 in each octet)
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        String str = "255.255.255.255";  // Test case

        System.out.println("Valid? " + str.matches(regex));
    }
}
