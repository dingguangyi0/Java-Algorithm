package com.ycdr.algorithm.sort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Sort<Integer> mergeSort=new MergeSort<>();
        Integer[] i2=new Integer[]{5,6,4,2,1,3};
        mergeSort.sort(i2);
        System.out.println(Arrays.toString(i2));
        //[5, 6, 4, 2, 1, 3]
        //0 3 6
    }
}
