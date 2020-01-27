package com.yakov.advanced01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLesson {

    static void linkedListTry() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(0);
        list.size();
        list.remove(1);
        System.out.println(list);
    }

    private static void measureTime(List<Integer>list) {
        for (int i = 0; i < 100000; i++){
            list.add(i);
        }

//        for (int j = 0; j < 100000; j++){
//            list.get(j);
//        }

//        for (int j = 0; j < 50000; j++){
//            list.remove(3);
//        }

        long start = System.currentTimeMillis();
        for (int j = 0; j < 50000; j++) {
            list.add(0, j);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //Adding elements is better for ArrayList then for LinkedList
    //Get element is much better for ArrayList then for LinkedList (Get is 1000 times faster for ArrayList)
    //Remove element inside or add element inside is much quicker for LinkedList then for ArrayList (1000 times quicker)

    static void estimate() {
        List<Integer> linkedList = new LinkedList<>();
        //head -> [5] -> [1] -> [2]
        List<Integer> arrayList = new ArrayList<>();
        // [7][6][1]
        measureTime(linkedList);
        measureTime(arrayList);
    }

    public static void main(String[] args) {

    }
}
