package com.yakov.basics33;

public class AnimalOne {

    private int id;

    public AnimalOne() {
    }

    public AnimalOne(int id) {
        this.id = id;
    }

    void eat() {
        System.out.println("Animal is eating ...");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
