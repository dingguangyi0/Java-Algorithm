package com.ycdr.algorithm.queue;

/**
 * 基于数组的环形队列
 * @param <T>
 */
public class ArrayCircularQueue<T> implements Queue<T> {

    //数组的实际容量
    protected int capacity;
    /**
     * 对象数组
     */
    private Object[] Q;
    /**
     * 队首元素的位置
     */
    private int head;
    /**
     * 队尾元素的位置
     */
    private int tail;

    public ArrayCircularQueue() {
        this(CAPACITY);
    }

    public ArrayCircularQueue(int cap) {
        capacity = cap;
        Q = new Object[capacity];
    }

    @Override
    public int size() {
        return (capacity-head+tail)%capacity;
    }

    @Override
    public boolean isEmpty() {
        return (head==tail);
    }

    @Override
    public T front() {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty();
        }
        return (T) Q[head];
    }

    @Override
    public void enqueue(T obj) {
        if (size() == capacity-1) {
            throw new ExceptionQueueEmpty();
        }
        Q[tail] = obj;
        tail = (tail+1) % capacity;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new ExceptionQueueEmpty();
        }
        T t = (T) Q[head];
        Q[head] = null;
        head = (head+1) % capacity;
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
