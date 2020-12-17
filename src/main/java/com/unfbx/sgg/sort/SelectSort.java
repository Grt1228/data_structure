package com.unfbx.sgg.sort;

import java.util.Arrays;

/**
 * @Description 选择排序
 * @Author Grt
 * @Date 2020-12-15
 */
public class SelectSort {


    public static void main(String[] args) {

        int[] arr = {3, 9, -1, 10, 20};
        System.out.println(Arrays.toString(sort(arr)));
    }


    public static int[] sort(int[] arr){


        for(int i = 0 ; i<arr.length-1 ;i++){
            int min = arr[i];
            int minIndex = i;
            int temp = 0;
            for(int j = i+1 ; j<arr.length-1 ;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }

        return arr;

    }
}
