package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-12
 */
public class offer17_16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(massage(arr));
    }

    public static int massage(int[] nums) {
        if(nums == null ||nums.length ==0){
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length + 1];

        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = nums[1];

        for (int i = 3; i <= nums.length; i++) {
            int max = Math.max(dp[i - 2], dp[i - 3]);
            int current = nums[i - 1];
            dp[i] = max + current;

        }
        return Math.max(dp[dp.length - 1], dp[dp.length - 2]);

    }
}
