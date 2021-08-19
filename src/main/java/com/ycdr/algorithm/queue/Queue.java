package com.ycdr.algorithm.queue;

public interface Queue<T> {
    //数组的默认容量
    int CAPACITY = 1000;
    /**
     * 返回队列中元素数目
     * @return
     */
    int size();

    /**
     * 判断队列是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 取队首元素（但不删除）
     * @return
     */
    T front();

    /**
     * 入队
     * @param obj
     */
    void enqueue (T obj);

    /**
     * 出队
     * @return
     */
    T dequeue();

    /**
     * 遍历
     */
    void traversal();
}
