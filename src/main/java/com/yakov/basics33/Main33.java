package com.yakov.basics33;

import java.util.ArrayList;
import java.util.List;

public class Main33 {

    static class Dog extends Animal{
        String beard;

        void bark(){
            System.out.println(String.format("Dog %s is Barking", this.beard));
        }

        public Dog(String beard) {
            this.beard = beard;
        }
    }

    static class Animal {
        String name;


        void eat(){
            System.out.println(String.format("Animal %s is Eating", this.name));
        }
    }

    public static void main(String[] args) {
        Dog doggy = new Dog("Shepard");
        List <String> list= new ArrayList<>();
        list.add("Kirill");
        list.add("Andrey");
        //Other than String object cannot be added
        //list.add(doggy);
        String member = list.get(0);

        List<Animal> listOfAnimal = new ArrayList<>();
        for (Animal animal: listOfAnimal){
            System.out.println(animal);
        }


    }

    void someMethod(){
        try {

        }catch (NullPointerException e){

        }catch (IllegalArgumentException e){

        }catch (Exception e){

        }finally {

        }
    }
}
