package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-25
 */
public class No64 {

    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(arr));
    }

    public static int minPathSum(int[][] grid) {


        //dp[i][j] = Min(dp[i-1][j],dp[i][j-1]) + grid[i][j];

        //初始化
        //dp[0][0] = grid[0][0];
        //dp[0][1] = grid[0][1] + grid[0][0]
        //dp[1][0] = grid[1][0] + grid[0][0]
        int n1 = grid.length;
        int n2 = grid[0].length;
        int[][] dp = new int[n1][n2];
        //初始化数据
        dp[0][0] = grid[0][0];


        for (int i = 1; i < n1; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < n2; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < n1; i++) {
            for (int j = 1; j < n2; j++) {
                dp[i][j] =  Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }

        return dp[n1-1][n2-1];


    }
}
