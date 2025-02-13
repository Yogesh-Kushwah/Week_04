package org.example.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseListExample {
    public static void main(String[] args) {
        // Example input for ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Example input for LinkedList
        List<Integer> linkedList = new LinkedList<>(arrayList);

        // Reverse both lists
        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        System.out.println("Original LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

    // Method to reverse a list
    static void reverseList(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Swap elements at i and (size - i - 1)
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }
}
