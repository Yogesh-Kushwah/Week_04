package org.example.setinterface.twosetsequal;

import java.util.HashSet;
import java.util.Set;

public class ChekingSets {
    public static void main(String[] args) {
        // Define two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(1);
        set2.add(2);
        set2.add(3);

        // Compare the sets
        boolean areEqual = set1.equals(set2);

        // Output the result
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are the two sets equal? " + areEqual);
    }
}
