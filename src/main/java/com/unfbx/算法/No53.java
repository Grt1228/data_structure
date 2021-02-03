package com.unfbx.算法;

/**
 * @Description
 * 贪心算法
 * @Author Grt
 * @Date 2021-02-03
 */
public class No53 {

    public static void main(String[] args) {

        int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(nums));
        }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int res = nums[0];

        for (int i = 0 ;i <nums.length ;i++){
            if(sum > 0) {
                sum += nums[i];
            }else{
                sum = nums[i];
            }

            res = Math.max(sum,res);
        }

        return res;
    }
}
