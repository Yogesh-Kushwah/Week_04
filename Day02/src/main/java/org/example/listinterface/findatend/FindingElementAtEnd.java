package org.example.listinterface.findatend;


import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class FindingElementAtEnd {
    public static void main(String[] args) {

        int eleLast= 2;

        List<Character> list= new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

       Collections.reverse(list);

        System.out.println(list.get(eleLast-1));
    }
}
