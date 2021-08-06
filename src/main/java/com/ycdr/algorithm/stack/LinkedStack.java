package com.ycdr.algorithm.stack;

import com.ycdr.algorithm.linked.SinglyLinkedList;

import java.util.Objects;

/**
 * 基于链表实现 栈
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {

    private int count;

    private SinglyLinkedList<T> link;

    public LinkedStack() {
    }

    @Override
    public boolean push(T value) {
        if (Objects.isNull(link)){
            link = new SinglyLinkedList<>();
        }
        link.insertHead(value);
        count++;
        return true;
    }

    @Override
    public T pop() {
        if (count == 0) {
            return null;
        }
        count--;
        return link.deleteHead();
    }

    @Override
    public T peek() {
        return link.findHead();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "count=" + count +
                ", link=" + link +
                '}';
    }


    public static void main(String[] args) {
        Stack<Integer> stack=new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
    }
}
