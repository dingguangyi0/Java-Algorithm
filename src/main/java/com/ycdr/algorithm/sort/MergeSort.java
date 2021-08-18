package com.ycdr.algorithm.sort;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(T[] t) {
        Comparable[] aux = new Comparable[t.length - 1];
        mergeSort((T[]) aux,t,0,t.length);
    }

    //[5, 6, 4, 2, 1, 3]
    // 5 6 4
    // 0 1
    //
    public void mergeSort(T[] aux,T[] t,int lo,int hi) {
        if (lo>=hi) return;
        int mi = (hi+lo)/2;
        mergeSort(aux,t,lo,mi);
        mergeSort(aux,t,mi+1,hi);
        //merge(aux,t,lo,mi,hi);
        System.out.println("lo:"+lo+" mi:"+mi+" hi:"+hi);
    }
}
