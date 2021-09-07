package com.unfbx.算法;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-03
 */
public class Offer17_14 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println(Arrays.toString(smallestK3(arr, 4)));
    }

    /**
     * 基于api
     *
     * @param arr
     * @param k
     * @return
     */
    public static int[] smallestK1(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }

    /**
     * 基于优先队列实现
     *
     * @param arr
     * @param k
     * @return
     */
    public static int[] smallestK2(int[] arr, int k) {
        //创建队列，前k个数字先装进去
        PriorityQueue<Integer> queue = new PriorityQueue<>((num1, num2) -> num2 - num1);
        for (int i = 0; i < k; i++) {
            queue.add(arr[i]);
        }
        //遍历后面的length-k个
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < queue.peek()) {
                queue.poll();
                queue.add(arr[i]);
            }
        }
        //队列转数组
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = queue.poll();
        }

        return res;

    }

    /**
     * 基于快速排序
     *
     * @param arr
     * @param k
     * @return
     */
    public static int[] smallestK3(int[] arr, int k) {

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        return null;
    }

    public static void quickSort(int[] arr, int l, int r) {
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
            quickSort(arr, l, i - 1); /* 递归调用 */
            quickSort(arr, i + 1, r); /* 递归调用 */
        }
    }
}
