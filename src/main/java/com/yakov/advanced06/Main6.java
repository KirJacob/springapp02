package com.yakov.advanced06;

import java.util.HashMap;
import java.util.Map;

public class Main6 {
    //Map - отображение или карта
    public static void main(String[] args) {
        // 1- > [.. .. ..]
        // 2- > [.. .. ..]

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(511, "FiveHundredEleven");
        map.put(211, "TwoHundredEleven");
        map.put(12, "Twelve");

        System.out.println(map);

        map.put(3, "ThreeAnother");

        System.out.println(map);

        System.out.println("getMap = " + map.get(3));

        for (Map.Entry<Integer, String>entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
