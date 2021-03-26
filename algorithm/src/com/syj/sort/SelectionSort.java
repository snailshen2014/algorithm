package com.syj.sort;

import com.syj.util.ArrayBuilder;

import java.util.Arrays;

/**
 * @description:
 * @author:shenyanjun
 * @time: 2021/3/26 11:00 上午
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] elements = ArrayBuilder.generateArray(100000);
//        ArrayBuilder.printArray(elements);
        long begin = System.currentTimeMillis();
        selectionSort(elements);
        System.out.println("###cost time:"+ (System.currentTimeMillis() - begin) + "ms");
//        ArrayBuilder.printArray(elements);
    }

    /**
     * 选择排序算法
     *          1.找到最小的数
     *          2.交换找到最小的数，放在数组左边
     *          3.一直重复1，2
     * @param elements
     */
    public static void selectionSort(int[] elements) {
        for (int i = 0;i < elements.length;i++) {
            int minIndex = i;
            for (int j = i+1; j < elements.length;j++) {
                if (elements[minIndex] >= elements[j]) {
                    minIndex = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }

}
