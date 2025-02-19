//1️⃣5️⃣ Validate a Social Security Number (SSN)
//🔹 Example Input:
//        "My SSN is 123-45-6789."
//        🔹 Expected Output:
//        ✅ "123-45-6789" is valid
//❌ "123456789" is invalid
//


package org.example.com.regix.advanced_problems.ip_address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNNumber {
    public static void main(String[] args) {

        // Example input
        String text = "My SSN is 123-45-6789.";

        // Regex pattern to extract a valid SSN
        String regix="\\b\\d{3}-\\d{2}-\\d{4}\\b";


        Pattern pattern = Pattern.compile(regix);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println(matcher.group()+ "is valid ");
        }
        else {
            System.out.println(" No valid SSN found");
        }
    }
}
