package org.example.setinterface.subset;

import java.util.HashSet;
import java.util.Set;

        public class Subset  {
            public static void main(String[] args) {
                // Define Set1
                Set<Integer> set1 = new HashSet<>();
                set1.add(2);
                set1.add(3);

                // Define Set2
                Set<Integer> set2 = new HashSet<>();
                set2.add(1);
                set2.add(2);
                set2.add(3);
                set2.add(4);

                // Check if Set1 is a subset of Set2
                boolean isSubset = checkSubset(set1, set2);

                // Output the result
                System.out.println("Is Set1 a subset of Set2? " + isSubset);
            }

            public static <T> boolean checkSubset(Set<T> subset, Set<T> superset) {
                // Use the containsAll() method to check if all elements of subset are in superset
                return superset.containsAll(subset);
            }
        }




