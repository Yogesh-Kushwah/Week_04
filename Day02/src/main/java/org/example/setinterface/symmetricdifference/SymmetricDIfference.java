package org.example.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDIfference {
    public static void main(String[] args) {

        Set<Integer> set1= new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2= new HashSet<>();
        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

       Set<Integer> differnce=  symmetricDifference(set1,set2);
        System.out.println(differnce);


    }
    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2){
        Set<T> result= new HashSet<>(set1);
           result.addAll(set2);

        Set<T> intersection= new HashSet<>(set1);

        intersection.retainAll(set2);

        result.removeAll(intersection);

        return result;


    }
}
