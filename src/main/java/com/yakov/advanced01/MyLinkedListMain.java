package com.yakov.advanced01;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(11);
        myLinkedList.add(13);
        System.out.println(myLinkedList);
        System.out.println("size=" + myLinkedList.size());
        System.out.println(myLinkedList.get(1));

        System.out.println("-----------");

        MyLinkedListA myLinkedListA = new MyLinkedListA();
        myLinkedListA.add(5);
        myLinkedListA.add(6);
        myLinkedListA.add(7);
        myLinkedListA.add(11);
        myLinkedListA.add(13);
        System.out.println(myLinkedListA);
        System.out.println(myLinkedListA.get(1));
        myLinkedListA.remove(0);
        System.out.println(myLinkedListA);
    }
}
