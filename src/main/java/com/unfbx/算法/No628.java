package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-22
 */
public class No628 {

    public int maximumProduct(int[] nums) {

        if (nums.length < 3) {
            return 0;
        }
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }


        return 0;


    }
}
