package com.ycdr.algorithm.sort;

/**
 * 冒泡排序
 * @param <T>
 */
public class BubbleSort<T extends Comparable<T>> implements Sort<T>{
    @Override
    public void sort(T[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 1; j < t.length-i; j++) {
                if (less(t[j-1],t[j])){
                    exch(t,j-1,j);
                }
            }
        }
    }
}
