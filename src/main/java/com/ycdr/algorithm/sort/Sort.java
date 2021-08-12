package com.ycdr.algorithm.sort;

/**
 * 数组排序框架基础模版
 */
public interface Sort<T extends Comparable<T>> {
    /**
     * 具体排序算法
     * @param t
     */
    void sort(T[] t);

    /**
     * 比价大小
     * @param v
     * @param w
     * @return
     */
    default boolean less(T v,T w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换位置
     * @param t
     * @param i
     * @param j
     */
    default void exch(T[] t,int i,int j) {
        T tmp = t[i];
        t[i] = t[j];
        t[j] = tmp;
    }

    /**
     * 打印数组
     * @param t
     */
    default void show(T[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println();
    }

    /**
     * 判断数组元素是否有序
     * @param t
     * @return
     */
    default boolean isSorted(T[] t) {
        for (int i = 1; i < t.length; i++) {
            if (less(t[i],t[i-1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 合并t[lo..mid] t[mid..hi]
     * @param t
     * @param lo
     * @param mid
     * @param hi
     */
    default void merge(T[] aux,T[] t,int lo,int mid,int hi) {
        int i = lo,j = mid + 1;
        //将 t[lo..mid] t[mid..hi] 复制到 aux[lo..hi]
        for (int k = lo; k <= hi; k++) {
            aux[k] = t[k];
        }

        for (int k = lo; k <=hi; k++) {
            if (i > mid) {
                t[k] = aux[j++];
            } else if (j > hi) {
                t[k] = aux[i++];
            } else if (less(aux[j],t[i])) {
                t[k] = aux[j++];
            } else {
                t[k] = aux[i++];
            }
        }
    }
}
