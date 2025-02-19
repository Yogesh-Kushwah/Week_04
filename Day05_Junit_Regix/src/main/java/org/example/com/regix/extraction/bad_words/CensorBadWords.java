package org.example.com.regix.extraction.bad_words;

import java.util.regex.*;

public class CensorBadWords {
    public static void main(String[] args) {
        // List of bad words to censor
        String[] badWords = {"damn", "stupid"};

        // Sample input text
        String text = "This is a Damn bad example with some stupid words.";

        // Replace bad words with ****
        for (String word : badWords) {
            text = text.replaceAll( "(?i)\\b"+ word + "\\b", "****");
        }

        // Print censored text
        System.out.println(text);
    }
}
