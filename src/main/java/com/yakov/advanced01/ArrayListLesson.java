package com.yakov.advanced01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLesson {

    static void setArrayOuOfBound() {
        int[] x = new int[3];
        for (int i = 0; i < 4; i++) {
            x[i] = i;
        }
    }

    static void arrayListUse() {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(11);
        arrList.add(13);
        arrList.remove(1);
        for (int i = 1; i<=100; i++){
            arrList.add(i);
        }
        System.out.println(arrList);
        System.out.println(arrList.get(4));
        System.out.println(arrList.size());

        for (int i = 0; i < arrList.size(); i++){
            System.out.println("arrList(" + i + ")=" + arrList.get(i));
        }

        for (Integer element:arrList){
            System.out.println("element=" + element);
        }
        arrList = new LinkedList<>();
        arrList = Arrays.asList(1,2,3);
        List<Integer> list2 = new ArrayList<>(arrList);
        System.out.println(list2);
    }

    public static void main(String[] args) {


    }
}
