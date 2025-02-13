package org.example.listinterface.removeduplicates;

import java.util.*;

public class DuplicatesRemoving {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3); list.add(4);

        Set<Integer> ele= new LinkedHashSet<>(list);

        System.out.println("Element with duplicacy");
        System.out.println(list);
        System.out.println("Element without duplicacy");
        System.out.print(ele);
    }
}
