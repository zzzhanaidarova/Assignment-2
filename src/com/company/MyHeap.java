package com.company;

public class MyHeap<T extends Comparable<T>> extends MyArrayList<T> {

    private int length = 0;
    private int capacity = 100;
    private Object[] array = new Object[capacity];

    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int current = i;
    }

    @Override
    public boolean remove(T item){
        for (int i=0; i<length; i++){
            if (array[i].equals(item)){
                length--;
                array[i] = array[length];
                array[length] = null;
                heapify(0);
                return true;
            }
        }
        return false;
    }
}
