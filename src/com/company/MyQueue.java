package com.company;

public class MyQueue<T extends Comparable<T>> extends MyLinkedList<T> {
    private class MyNode<T> {
        T item;
        MyNode next;

        public MyNode(T item) {
            this.item = item;
        }
    }

    private int length;
    private MyNode<T> head, tail;

    public MyQueue(){
        length = 0;
        head = null;
        tail = null;
    }

    public boolean empty(){
        return length == 0;
    }

    public int size(){
        return length;
    }

    public T peek(){
        if (length == 0) return null;
        T item = head.item;
        return item;
    }

    public void enqueue(T item){ // add at the end
        if (head == null){
            head = new MyNode<>(item);
            tail = head;
        }
        else {
            tail.next = new MyNode(item);
            tail = tail.next;
        }
        length++;
    }

    public T dequeue(){ // Retrieves and deletes the front element
        if (length == 0) return null;
        T item = head.item;
        head = head.next;
        length--;
        return item;
    }
}
