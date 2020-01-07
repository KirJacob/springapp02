package com.yakov.core01;

public class TestCarEntity {
    public static void main(String[] args) {
        CarEntity carEntity01 = new CarEntity("Honda", "CRV", "Grey Blue", 2008);
        CarEntity carEntity02 = new CarEntity("Honda", "CRV", "Grey Blue", 2008);
        System.out.println(carEntity01 == carEntity02);
        System.out.println(carEntity01.equals(carEntity02));
    }
}
