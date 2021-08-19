package com.ycdr.algorithm.queue;

/**
 * 基于链表的队列
 * @param <T>
 */
public class LinkedQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public T front() {
        return head.data;
    }

    @Override
    public void enqueue(T obj) {
        if (head==null) {
            head = new Node<>(obj);
            tail=head;
            return;
        }
        tail.next=new Node<>(obj);
        tail = tail.next;
        size++;
    }

    @Override
    public T dequeue() {
        if (head==null) {
            throw new ExceptionQueueEmpty();
        }
        T t=head.data;
        head=head.next;
        if (head==null) {
            tail=null;
        }
        size--;
        return t;
    }

    @Override
    public void traversal() {
        if (head==null) {
            return;
        }
        Node<T> t=head;
        while (t!=null) {
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();
    }

    class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T t) {
            this.data = t;
        }
    }
}
