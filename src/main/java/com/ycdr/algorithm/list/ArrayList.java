package com.ycdr.algorithm.list;

/**
 * 动态扩容的list
 */
public class ArrayList<T> {

    private Object[] object = {};
    private final int CAPACITY= 10;
    private int size;
    public ArrayList() {
        object = new Object[CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity <= CAPACITY) {
            object = new Object[CAPACITY];
        }else {
            object = new Object[CAPACITY];
        }
    }

    public void add(T value) {
        if (size == object.length) {

        }
        object[size] = value;
        size++;
    }
}
