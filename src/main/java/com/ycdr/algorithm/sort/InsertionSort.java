package com.ycdr.algorithm.sort;

/**
 * 插入排序
 * 算法思路
 * 1. 默认序列中的第0个元素是有序的；
 * 2. 从下标为1（下标从0开始）的元素开始，取当前下标i位置处的元素a[i]保存到一个临时变量里；
 * 3. 对前半部分有序序列的循环遍历，并与临时变量比较，直到遇到一个比临时变量小的元素（这里默认是从小到大排序），交换数据
 * 4. 将待插入元素的下标 i 向后推移一个位置；
 * 5. 重复进行第2步到第4步，直到乱序序列中的元素被全部插入到有序序列中；
 */
public class InsertionSort<T extends Comparable<T>> implements Sort<T> {

    /**
     * 4,5,6,3,1,2
     *
     * @param t
     */
    @Override
    public void sort(T[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i; j >0 && less(t[j],t[j-1]); j--) {
                exch(t,j,j-1);
            }
        }
    }
}
