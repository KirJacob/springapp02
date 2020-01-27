package com.yakov.advanced19;

import java.util.*;

public class Main19 {
    // contract between equals and hashcode
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "One");
        map.put(1, "Another one");

        set.add(1);
        set.add(1);

        System.out.println(map);
        System.out.println(set);

        Map<Person, String> map2 = new HashMap<>();
        Set<Person> set2 = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");
        Person person3 = new Person(2, "Katy");
        map2.put(person1, "something");
        map2.put(person2, "something");
        map2.put(person3, "something");
        set2.add(person1);
        set2.add(person2);
        set2.add(person3);

        System.out.println(map2);
        System.out.println(set2);

        Integer x = 100;
        System.out.println(x.hashCode());
        String name = "AA";
        System.out.println(name.hashCode());

    }

    static class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;

            Person person = (Person) o;

            if (id != person.id) return false;
            return name != null ? name.equals(person.name) : person.name == null;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        /*
        Контракт hashcode and equals
        1) у двух проверяемых обьектах вызывается быстрый hashcode
        2) если hashcode разный то и обекты разные
        3) если hashcode равны то вызываем equals
        4) equals выдает правильный ответ
         */
    }
}
