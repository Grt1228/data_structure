package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-18
 */
public class No746 {

    public static void main(String[] args) {
        //int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        //1、确定dp数组以及下标的含义
        //dp[i]：第i个台阶所花费的最少体力味dp[i]


        //2、确定递推公式
        //得到dp[i]有两种方式，一个是dp[i-1]一个是dp[i-2]
        //取其中最小那一个，dp[i] = min(dp[i-1],dp[i-2]) + cost[i]

        //3、dp数组的初始化
        //dp[0] = cost[0]
        //dp[1] = cost[1]
        if (cost == null || cost.length == 1) {
            return 0;
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];

        //4、确定遍历顺序
        //dp[i] 是由dp[i-1] 和dp[i-2]推导出来的
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
