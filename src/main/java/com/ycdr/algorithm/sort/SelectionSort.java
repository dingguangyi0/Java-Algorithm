package com.ycdr.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 首先，找到数组中最小的那个元素，
 * 其次，将它和数组的第一个元素交换位置（如果第一个元素就是最小元素那么它就和自己交换）。
 * 再次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
 * 如此往复，直到将整个数组排序。这种方法叫做选择排序，因为它在不断地选择剩余元素之中的最小者
 * @param <T>
 */
public class SelectionSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public void sort(T[] t) {
        for (int i = 0; i < t.length; i++) {
            int mix=i;
            for (int j = i; j < t.length; j++) {
                if (less(t[mix],t[j])) {
                    mix = j;
                }
            }
            exch(t,i,mix);
        }
    }
}
