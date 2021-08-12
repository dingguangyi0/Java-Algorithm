package com.ycdr.algorithm.sort;

/**
 * 希尔排序
 */
public class ShellSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(T[] t) {
        int n = t.length;
        int h = 1;
        while (h < n/3) {
            h = 3 * h +1;
        }
        while (h>=1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >=h && less(t[j],t[j-h]); j-=h) {
                    exch(t,j,j-h);
                }
            }
            h = h / 3;
        }
    }
}
