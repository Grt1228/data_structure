package com.unfbx.算法;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-12
 */
public class Offer03 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(arr));
    }

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<nums.length;i++){

            if(set.add(nums[i])){
                continue;
            }
            return nums[i];
        }

        return 0;
    }
}
