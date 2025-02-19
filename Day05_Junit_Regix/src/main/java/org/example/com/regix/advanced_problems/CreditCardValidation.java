package org.example.com.regix.advanced_problems.ip_address;

import java.util.regex.*;

public class CreditCardValidation {
    public static void main(String[] args) {
        String regex = "^(4\\d{15}|5\\d{15})$";
        String[] cards = { "4123456789012345", "5123456789012345", "6123456789012345", "423456789012" };

        for (String card : cards) {
            if (card.matches(regex)) {
                System.out.println(card + " is a Valid Card");
            } else {
                System.out.println(card + " is Invalid");
            }
        }
    }
}
