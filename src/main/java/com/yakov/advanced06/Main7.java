package com.yakov.advanced06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main7 {

    static void testMapOrder(Map<String,String> map){
        map.put("кошка", "cat");
        map.put("собака", "dog");
        map.put("слон", "elephant");

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("-----------------");
    }

    static void testMapSecond(Map<Integer,String>map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("-----------------");

    }

    public static void main(String[] args) {

        //element are sorted by hash, so almost randomly ordered
        Map<String,String>translations = new HashMap<>();
        testMapOrder(translations);

        //LinkedHashMap
        //order of adding elements to map is kept
        Map<String,String> translations2 = new LinkedHashMap<>();
        testMapOrder(translations2);

        //TreeMap
        //elements in map are sorted by key
        //for object, order of sorting should be set, natural ordering
        Map<String,String> translations3 = new TreeMap<>();
        testMapOrder(translations3);

        //OTHER
        Map<Integer,String>map1 = new HashMap<>();
        testMapSecond(map1);
        Map<Integer,String>map2 = new LinkedHashMap<>();
        testMapSecond(map2);
        Map<Integer,String>map3 = new TreeMap<>();
        testMapSecond(map3);
    }
}
