package org.example.com.regix.extraction.multiplespaces;

public class EscapeMultipleSpace {

    public static void main(String[] args) {



        // Text contain normal text
        String webText ="This        is   an       example   with   multiple spaces.";

        // removing the space form the text
        String replaceText= webText.replaceAll("\\s+"," ");

        System.out.println("Original : "+webText);
        System.out.println("Formatted: "+replaceText);
    }
}
