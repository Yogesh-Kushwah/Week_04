package org.example.setinterface.unionintersectionstwoset;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to set2
        set2.add(3);
        set2.add(5);
        set2.add(6);


        Set<Integer> union = union(set1, set2);
        Set<Integer> interSection = InterSection(set1, set2);

        System.out.print("Union of Sets :");
        System.out.println(union);
        System.out.print("Intersection of Sets :");
        System.out.println(interSection);



    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {

        Set<T> set3 = new HashSet<>(set1);
        set3.addAll(set2);

    return set3;
}

    public static <T> Set<T> InterSection(Set<T> set1, Set<T> set2){

        Set<T> set3 = new HashSet<>(set1);
        set3.retainAll(set2);

        return set3;
    }
}
