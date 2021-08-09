package com.ycdr.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort<T extends Comparable> {
    public void bubbleSort(T[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length-1; j++) {
                if (CommonUtil.compareTo(t[j],t[j+1])<0) {
                    T tmp=t[j];
                    t[j]=t[j+1];
                    t[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort=new BubbleSort<>();
        Integer[] i=new Integer[]{4,5,6,3,1,2};
        bubbleSort.bubbleSort(i);
        System.out.println(Arrays.toString(i));
    }
}
