package com.ycdr.algorithm.sort;

public class SortTest {
    public static void main(String[] args) {
//        Sort<Integer> bubble=new BubbleSort<>();
//        Integer[] i=new Integer[]{4,5,6,3,1,2};
//        bubble.sort(i);
//        bubble.show(i);

        Sort<Integer> selection=new SelectionSort<>();
        Integer[] i2=new Integer[]{5,6,4,2,1,3};
        selection.sort(i2);
        selection.show(i2);

//        Sort<Integer> integer=new InsertionSort<>();
//        Integer[] i3=new Integer[]{4,5,6,3,1,2};
//        integer.sort(i3);
//        integer.show(i3);
//
//        Sort<Integer> shell=new ShellSort<>();
//        Integer[] i4=new Integer[]{4,5,6,3,1,2};
//        shell.sort(i4);
//        shell.show(i4);
    }
}
