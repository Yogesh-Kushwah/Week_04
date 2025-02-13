package org.example.setinterface.sortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {

        HashSet<Integer> hashSet= new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(9);
        hashSet.add(1);

        List<Integer> sort= new ArrayList<>(hashSet);

        Collections.sort(sort);

        System.out.println("Sorted List: "+ sort);



    }
}
