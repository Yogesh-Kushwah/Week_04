package org.example.listinterface.rotateelements;

import java.util.ArrayList;
import java.util.List;

public class RotateElements {

    public static void main(String[] args) {

        int rotation= 2;

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List before Rotation");
        System.out.println(list);

        List<Integer> rotate= rotateList(list, rotation);

        System.out.println("List After Rotation");
        System.out.println(rotate);
    }

    private static List<Integer> rotateList(List<Integer> list, int rotate) {
        int length= list.size();

        int rotateBy= rotate% length;

        List<Integer> rotateList= new ArrayList<>();

        for(int i= rotateBy ; i<length;i++){

            rotateList.add(list.get((i)));

        }
        for(int i=0; i<rotateBy;i++){
            rotateList.add(list.get(i));
        }

        return rotateList;

    }
}
