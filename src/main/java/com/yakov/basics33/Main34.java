package com.yakov.basics33;

import java.util.ArrayList;
import java.util.List;

//WILDCARDS
public class Main34 {
    public static void main(String[] args) {
        List<AnimalOne> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new AnimalOne(1));
        listOfAnimal.add(new AnimalOne(2));

        List<DogOne>dogs = new ArrayList<>();
        dogs.add(new DogOne());
        dogs.add(new DogOne());

        test(listOfAnimal);
        test(dogs);
    }
    /*
        Object
        Animal
        Dog
     */

    //can accept AnimalOne and their children
    private static void test(List<? extends AnimalOne> list) {
        for (Object animal: list){
            System.out.println(animal);
        }
    }

    //can accept AnimalOne and their parents
    private static void test2(List<? super AnimalOne> list) {
        for (Object animal: list){
            System.out.println(animal);
        }
    }
}
