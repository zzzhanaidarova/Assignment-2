package com.company;

public class MyStack<T extends Comparable<T>> extends MyLinkedList<T> {
    private class MyNode{
        T item;
        MyNode next;
        public MyNode(T item){
            this.item=  item;
        }
    }

    private int length;
    private MyNode head;

    public MyStack(){
        length = 0;
        head = null;
    }

    public boolean empty(){
        return length==0;
    }

    public int size(){
        return length;
    }

    public T peek(){
        if (head == null) return null;
        return head.item;
    }

    public void push(T item){
        MyNode newNode = new MyNode(item);
        if (head == null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public T pop(){
        if (head == null) return null;

        MyNode node = head;
        head = head.next;
        length--;
        return node.item;
    }
}
