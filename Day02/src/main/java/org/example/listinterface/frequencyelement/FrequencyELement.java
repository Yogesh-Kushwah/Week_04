package org.example.listinterface.frequencyelement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyELement {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");


Map<String ,Integer> count = frequecyCount(list);

        System.out.println(" list: "+ list);

        System.out.println("Frequency: "+count);






    }

    private static Map<String, Integer> frequecyCount(List<String> list) {

        Map<String,Integer> map= new HashMap<>();

        for(String l:list){

            map.put(l, map.getOrDefault(l,0)+1);
        }
        return map;
    }



}
