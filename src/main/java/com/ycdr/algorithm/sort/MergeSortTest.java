package com.ycdr.algorithm.sort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Sort<Integer> mergeSort=new MergeSort<>();
        Integer[] i4=new Integer[]{4,5,6,3,1,2};
        Integer[] i5=new Integer[i4.length];
        mergeSort.merge(i5,i4,0,2,5);
        System.out.println(Arrays.toString(i4));
    }
}
