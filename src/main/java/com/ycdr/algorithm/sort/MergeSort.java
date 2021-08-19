package com.ycdr.algorithm.sort;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {
    Comparable[] aux;
    //[5, 6, 4, 2, 1, 3]
    //
    @Override
    public void sort(T[] t) {
        aux=new Comparable[t.length];
        mergeSort(t,0,t.length-1);
    }

    public void mergeSort(T[] t,int start,int end) {
        //不能在分的时候退出递归
        if (start>=end){return;}
        //二分拆分
        int hi = (start+end)/2;
        mergeSort(t,start,hi);
        mergeSort(t,hi+1,end);
        System.out.println("start::"+start+" end::"+end+" hi::"+hi);
        merge((T[]) aux,t,start,hi,end);
    }

    public void merge(T[] aux,T[] t,int start,int hi,int end){
        int i = start; //代表 左侧指针位置
        int j = hi+1; //代表右侧指针位置
        //将 t[start..hi] t[hi..end] 复制到 aux[start..end]
        for (int k = start; k <=end; k++) {
            aux[k]=t[k];
        }
        for (int k = start; k <=end; k++) {
            //如果左侧指针 超过右侧指针 说明 左侧数据排序完成，直接使用右侧指针数据
           if (i>j){
                t[k]=aux[j];
                j++;
             //如果右侧指针超过 最大指针 说明右侧数据排序完成  直接使用左侧指针数据
            }else if (j>end) {
                t[k]=aux[i];
                i++;
             //比较左右位置数据比较  左侧数据
            }else if (less(aux[i],aux[j])){
               t[k] = aux[i];
               i++;
            //！less(aux[i],aux[j])
           }else {
                t[k] = aux[j];
                j++;
            }
        }
    }

}
