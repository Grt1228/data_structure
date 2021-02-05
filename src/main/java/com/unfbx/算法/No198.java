package com.unfbx.算法;

/**
 * @Description 打家劫舍
 * @Author Grt
 * @Date 2021-02-05
 */
public class No198 {

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    //dp 方程 dp[i] = max(dp[i-2]+nums[i], dp[i-1])

    public static int rob(int[] nums) {
        //base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);


        for (int i = 2; i < nums.length; i++) {
            //动态方程
            //dp 方程 dp[i] = max(dp[i-2]+nums[i], dp[i-1])
            memo[i] = Math.max(memo[i-2] + nums[i], memo[i - 1]);

        }
        return memo[nums.length-1];
    }
}
