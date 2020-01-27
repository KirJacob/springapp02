package com.yakov.advanced19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//COMPARATOR
//TreeSet, TreeMap, ArrayList
//лексикографическая сортировка по умолчанию
//natural ordering
public class Main12 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("elephant");
        animals.add("frog");
        animals.add("bird");
        animals.add("o");
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
        Collections.sort(numbers);
        System.out.println(numbers);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(5);
        numbers2.add(0);
        numbers2.add(500);
        numbers2.add(100);
        Collections.sort(numbers2, new BackwardsIntegerComparator());
        System.out.println(numbers2);

        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(5);
        numbers3.add(0);
        numbers3.add(500);
        numbers3.add(100);

        //anonymous class
        Collections.sort(numbers3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else return 0;
            }
        });

        Collections.sort(numbers3, (o1, o2) -> {
            if (o1 < o2) {
                return 1;
            } else if (o1 > o2) {
                return -1;
            } else return 0;
        });
        System.out.println(numbers3);

        List<Person>people = new ArrayList<>();
        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Jack"));
        people.add(new Person(3, "Annie"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println(people);

    }

}
/*
 o1 > o2 =  1
 o1 < o2 = -1
 o1 = o2 =  0
 */

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else return 0;
    }

}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else return 0;
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
