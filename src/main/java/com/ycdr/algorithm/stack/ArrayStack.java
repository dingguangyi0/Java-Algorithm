package com.ycdr.algorithm.stack;

import java.util.Arrays;
import java.util.Objects;

/**
 * 使用数组实现 栈
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T>{

    private Object[] object;

    private int size;
    private int count;

    private static final int cap = 8;

    public ArrayStack() {
       this(cap);
    }

    public ArrayStack(int cap) {
        object = new Object[cap];
        size = cap;
        count = 0;
    }

    @Override
    public boolean push(T value) {
        if (Objects.isNull(value)) {
            return false;
        }
        if (count == size) {
            return false;
        }
        object[count] = value;
        count++;
        return true;
    }

    @Override
    public T pop() {
        if (count == 0) {
            return null;
        }
        return (T) object[--count];
    }

    @Override
    public T peek() {
        if (count == 0) {
            return null;
        }
        int tmp = count;
        return  (T) object[--tmp];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "object=" + Arrays.toString(object) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new ArrayStack<>();
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
