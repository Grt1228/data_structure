package com.unfbx.算法;

import java.util.Arrays;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-15
 */
public class offer40 {

    public int[] getLeastNumbers(int[] arr, int k) {

        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0 ;i <k;i++){
            res[i] = arr[i];
        }
        return res;
    }
}
