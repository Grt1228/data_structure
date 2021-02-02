package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-27
 */
public class No1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(twoSum(nums,6));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            map.put(target-nums[i],i);
        }
        return null;
    }
}
