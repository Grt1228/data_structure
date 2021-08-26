package com.unfbx.sgg.sort;

import java.util.Arrays;

/**
 * @Description 快速排序
 * @Author Grt
 * @Date 2020-12-15
 */
public class QuickSort {


    public static void main(String[] args) {

        int[] arr = {3, 9, -1, 10, 20,-100,90,9};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int i, j, x;

            i = l;
            j = r;
            x = arr[i];
            while (i < j) {
                while (i < j && arr[j] > x) {
                    j--; // 从右向左找第一个小于x的数
                }
                if (i < j) {
                    arr[i++] = arr[j];
                }
                while (i < j && arr[i] < x) {
                    i++; // 从左向右找第一个大于x的数
                }
                if (i < j) {
                    arr[j--] = arr[i];
                }
            }
            arr[i] = x;
            sort(arr, l, i - 1); /* 递归调用 */
            sort(arr, i + 1, r); /* 递归调用 */
        }

    }
}
