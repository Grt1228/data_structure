package com.unfbx.算法;

import java.util.List;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-19
 */
public class No120 {

    public static void main(String[] args) {

    }

    /**
     * 自底向上
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];

        //1、确定dp数组以及下标的含义
        //dp[i][j] 表示从点 (i, j) 到底边的最小路径和。


        //2、确定递推公式（自底向上）
        //dp[i][j] = min(dp[i+1][j] + dp[i+1][j+1]) + triangle[i][j]
        //从最后一行开始推导

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }

        //4、确定遍历顺序->自底向上


        //最终答案dp[0][0]

        return dp[0][0];
    }
}
