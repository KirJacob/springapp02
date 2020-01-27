package com.yakov.advanced01;

import java.util.Arrays;

public class MyLinkedListA {

    private Node head;
    private int size;

    private static class Node {
        private int value;
        private Node next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        //[1]->[2]->[3]

        size++;
    }

    void remove(int index) {
        int currentIndex = 0;
        Node temp = this.head;
        Node previous = this.head;
        while (currentIndex <= index) {
            if (currentIndex == index) {
                if (index == 0){
                    this.head = this.head.getNext();
                }else {
                    previous.setNext(temp.getNext());
                }
                this.size = this.size - 1;
            } else {
                if (index >= 1) previous = temp;
                temp = temp.getNext();
            }
            currentIndex++;
        }
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public String toStringMy() {
        MyLinkedListA.Node current = head;
        String result = "";
        String delimeter = ", ";
        int index = size;
        while (index > 0) {
            if (index == 1) delimeter = "";
            result = result + current.value + delimeter;
            current = current.next;
            index = index - 1;
        }
        return result;
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

}
