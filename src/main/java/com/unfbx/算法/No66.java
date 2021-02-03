package com.unfbx.算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-03
 */
public class No66 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(plusOne(nums));
    }

    public static int[] plusOne(int[] digits) {
        int oriLength = digits.length;

        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        int sum = 0;
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum += digits[i] * Math.pow(10, j);
            j += 1;
        }
        j = 0;
        while (sum > 0) {
            int i = sum % 10;
            sum = sum / 10;
            j++;
        }
        int[] res = new int[j];
        //for ()

        return res;
    }
}
