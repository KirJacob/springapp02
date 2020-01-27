package com.yakov.advanced01;

public class MyLinkedList {

    private Node internalElement;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    static class Node {
        Node previous;
        Integer value;

        private Node(Integer value) {
            this.value = value;
        }

        private Node(Node previous, Integer value) {
            this.previous = previous;
            this.value = value;
        }
    }

    void add(Integer element) {
        if (this.size == 1) {
            System.out.println("SECOND");
            internalElement.previous = new Node(internalElement.value);
            internalElement.value = element;
        } else if (this.size == 0) {
            System.out.println("INIT");
            internalElement = new Node(element);
        } else {
            Node currentNode = new Node(internalElement, element);
            internalElement = currentNode;
        }
        this.size = this.size + 1;
        System.out.println("added element " + element + " size=" + this.size);
    }

    public int size(){
        return this.size;
    }

    public Integer get(int index){
        if (index == this.size) return internalElement.value;
        else {
            Node element = internalElement.previous;
            int localIndex = this.size - 1;
            while (localIndex > index ){
                localIndex = localIndex - 1;
                element = element.previous;
            }
            return element.value;
        }
    }

    @Override
    public String toString() {
        Node current = internalElement;
        String result = "";
        int index = size;
        while (index > 0) {
            result = current.value + ", " + result;
            current = current.previous;
            index = index - 1;
        }
        return result;
    }
}
