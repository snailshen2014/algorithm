package com.syj.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author:shenyanjun
 * @time: 2021/3/26 10:12 上午
 */
public class ArrayBuilder {
    public static int[] generateArray(int size) {
        int[] temp = new int[size];
        for (int i = 0 ; i < size; i++) {
           temp[i] = randomNum(0,100);
        }
        return temp;
    }

    private static Integer randomNum(int min,int max) {
        Random random = new Random();
        return random.nextInt(max) % (max -min +1) + min;
    }
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
