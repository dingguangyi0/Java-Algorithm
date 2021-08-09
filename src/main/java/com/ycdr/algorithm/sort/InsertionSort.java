package com.ycdr.algorithm.sort;

/**
 * 插入排序
 */
public class InsertionSort<T extends Comparable> {

    // 4 5 6 3 1 2
    public void insertionSort(T[] t) {
        for (int i = 0; i < t.length; i++) {
            T v = t[i];
            for (int j = i; j < t.length; j++) {
              if (CommonUtil.compareTo(v,t[i])<0){
                  break;
              }
            }
        }
    }
}
