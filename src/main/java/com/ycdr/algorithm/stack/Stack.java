package com.ycdr.algorithm.stack;

public interface Stack<T> {
    /**
     * 压栈
     * @param value
     */
    boolean push(T value);

    /**
     * 出栈
     * @return
     */
    T pop();

    /**
     * 查看
     * @return
     */
    T peek();

    /**
     * 栈 元素数
     * @return
     */
    int size();
}
