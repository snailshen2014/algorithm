package com.syj.sort;

import com.syj.util.ArrayBuilder;

/**
 * @description:
 * @author:shenyanjun
 * @time: 2021/3/26 3:14 下午
 */
public class FindKth {
    public static void main(String[] args) {
        int[] elements = ArrayBuilder.generateArray(10);
        ArrayBuilder.printArray(elements);
        int kthNumber = kThElement(elements,0,elements.length,1);
        System.out.println("find kth number:"+kthNumber);

    }

    /**
     * 寻找第k大数
     * @param arr 数组
     * @param begin 数组初始位置0
     * @param end 数组大小
     * @return
     */
    public static int kThElement(int[] arr,int begin,int end,int k) {
        int num = 0;
        while (begin < end) {
            int pos = QuickSort.partition(arr,begin,end);
            if (pos == k -1) {
                num = arr[pos];
                break;
            } else if (pos > k - 1) {
                end = pos;
            } else if (pos < k -1) {
                begin = pos + 1;
            }
        }
        return num;
    }
}
