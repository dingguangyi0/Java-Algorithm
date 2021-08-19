package com.ycdr.algorithm.queue;

/**
 * 基于固定数组的队列
 * @param <T>
 */
public class ArrayFixedQueue<T> implements Queue<T>{
    //数组的实际容量
    protected int capacity;
    /**
     * 对象数组
     */
    private Object[] Q;

    private int head = 0;

    private int tail = 0;

    public ArrayFixedQueue(){
        this(CAPACITY);
    }

    public ArrayFixedQueue(int cap){
        capacity = cap;
        Q = new Object[capacity];
    }

    @Override
    public int size() {
        return tail - head;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    @Override
    public T front() {
        return null;
    }

    @Override
    public void enqueue(T obj) {
        if (size() == capacity) {
            throw new ExceptionQueueEmpty();
        }
        Q[tail++] = obj;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty();
        }
        T t = (T) Q[head];
        Q[head] = null;
        head++;
        return t;
    }

    @Override
    public void traversal() {
        for (int i = head; i < tail; i++) {
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }
}
