package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-19
 */
public class No1588 {

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0,j = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }
}
