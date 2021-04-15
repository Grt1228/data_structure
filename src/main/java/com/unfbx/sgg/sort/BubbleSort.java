package com.unfbx.sgg.sort;

import java.util.Arrays;

/**
 * @Description 冒泡
 * @Author Grt
 * @Date 2020-12-15
 */
public class BubbleSort {


    public static void main(String[] args) {


        int[] arr = {3, 9, -1, 10, 20};
        //int[] arr = {10, 9, 2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }

            }
            if (flag) {
                flag = false;
                continue;
            }
            break;
        }

        return arr;
    }
}
