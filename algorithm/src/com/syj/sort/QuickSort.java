package com.syj.sort;

import com.syj.util.ArrayBuilder;

/**
 * @description:
 * @author:shenyanjun
 * @time: 2021/3/26 2:35 下午
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] elements = ArrayBuilder.generateArray(15);
        ArrayBuilder.printArray(elements);
        long begin = System.currentTimeMillis();
        quickSort(elements,0,elements.length);
        System.out.println("###cost time:"+ (System.currentTimeMillis() - begin) + "ms");
        ArrayBuilder.printArray(elements);
    }

    /**
     * 通过双向查找
     * @param arr
     * @param begin 数组初始位置0
     * @param end 数组大小
     * @return 找到partion时，基数值的位置
     */
    public static int partition(int[]arr, int begin, int end) {
        int pivot = arr[begin];
        while(begin < end)
        {
            while(begin < end && arr[--end] >= pivot);
            arr[begin] = arr[end];
            while(begin < end && arr[++begin] <= pivot);
            arr[end] = arr[begin];
        }
        arr[begin] = pivot;
        return begin;
    }

    /**
     * 快速排序
     * @param arr
     * @param begin 数组初始位置0
     * @param end 数组大小
     */
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin >= end -1) return;
        int pos = partition(arr,begin,end);
        quickSort(arr,begin,pos);
        quickSort(arr,pos+1,end);
    }

}
