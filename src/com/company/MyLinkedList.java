package com.company;

import java.util.LinkedList;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private static class MyNode<T>{
        T data;
        MyNode<T> next, prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private int length = 0;
    private MyNode<T> head, tail;

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean contains(Object o) {
        if (length == 0) return false;
        else {
            MyNode<T> current = head;

            while (current != null) {
                if (current.data == o)
                    return true;
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        length++;
    }

    @Override
    public void add(T item, int index) {
        MyNode<T> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        MyNode<T> temp = current.next;
        current.next = new MyNode<>(item);
        (current.next).next = temp;
        length++;
    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        else {
            MyNode<T> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            MyNode<T> current = previous.next;
            previous.next = current.next;
            length--;
            return current.data;
        }
    }

    @Override
    public void clear() {
        length = 0;
        head = tail = null;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length) return null;
        else {
            MyNode<T> current = head.next;
            for (int i = 1; i < index; i++)
                current = current.next;
            return current.data;
        }
    }

    @Override
    public int indexOf(Object o) {
        if (head.data == o) return 0;
        else if (tail.data == o) return length - 1;
        else {
            MyNode<T> current = head.next;
            int index = 1;
            while (current != null) {
                if (current.data == o)
                    return index;
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        MyNode<T> current = head;
        for (int i = 0; i < length; i++) {
            if (current.data == o)
                index = i;
            current = current.next;
        }

        return index;
    }

    @Override
    public void sort() {
        if(length == 1) return;
        MyNode<T> current = head;
        int i = 0;
        while(i != length-1){
            if(((current.data)).compareTo((current.next).data) < 0){
                T temp = current.data;
                current.data = (current.next).data;
                (current.next).data = temp;
            }
            i++;
            current = current.next;
        }
    }
}
