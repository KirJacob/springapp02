package com.yakov.advanced18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet18 {

    static void testSet(Set<String>set) {
        set.add("Dog");
        set.add("Cat");
        set.add("Cat"); //we cannot add duplicated element
        set.add("Elephant");
        for (String element : set){
            System.out.println(element);
        }
        System.out.println("-----------");
    }
    //лексикографичесий порядок сортировки строк

    static Set<String>unionSet(Set<String>setOne, Set<String>setTwo){
        Set<String>result = new HashSet<>(setOne);
        result.addAll(setTwo);
        return result;
    }

    static Set<String>intersectionSet(Set<String>setOne, Set<String>setTwo){
        Set<String>result = new HashSet<>(setOne);
        result.retainAll(setTwo);
        return result;
    }

    static Set<String>differenceSet(Set<String>setOne, Set<String>setTwo){
        Set<String>result = new HashSet<>(setOne);
        result.removeAll(setTwo);
        return result;
    }

    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();
        testSet(linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        testSet(treeSet);

        Set<String> hashSet = new HashSet<>();
        testSet(hashSet);

        //contains is using hashing mechanism - constant time
        System.out.println(hashSet.contains("Dog"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);


        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Julia");
        hashSet2.add("Ann");
        hashSet2.add("Inna");
        hashSet2.add("Cate");
        hashSet2.add("Ksenia");

        Set<String> hashSet3 = new HashSet<>();
        hashSet3.add("Cate");
        hashSet3.add("Larisa");
        hashSet3.add("Marian");
        hashSet3.add("Nataly");
        hashSet3.add("Ksenia");

        //Union
        System.out.println(unionSet(hashSet2, hashSet3));

        //Intersect
        System.out.println(intersectionSet(hashSet2, hashSet3));

        //Difference
        System.out.println(differenceSet(hashSet2, hashSet3));

    }
}
