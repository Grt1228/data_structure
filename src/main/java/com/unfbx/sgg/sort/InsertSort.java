package com.unfbx.sgg.sort;

import java.util.Arrays;

/**
 * @Description 插入排序
 * @Author Grt
 * @Date 2020-12-16
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, 20};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){

        for(int i = 1 ;i<arr.length-1 ;i++){

            int changeNum = arr[i];
            int changeNumIndex = i;

            while (changeNumIndex > 0 && changeNum < arr[changeNumIndex-1] ){
                int temp = arr[changeNumIndex-1];
                arr[changeNumIndex-1] =  changeNum;
                arr[changeNumIndex] = temp;
                changeNumIndex--;
            }
        }
        return arr;
    }
}
