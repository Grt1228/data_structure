package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-19
 */
public class No62 {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        //1、确定dp数组以及下标的含义
        //dp[m][n]：走到(m,n)有dp[m][n]种路径


        //2、确定递推公式
        //dp[m][n] = dp[m-1][n] + dp[m][n-1]

        //3、dp数组的初始化，边界值都为1
        //dp[0][0] = 1
        for(int i = 0 ; i< m;i++){
            dp[i][0] = 1;
        }
        for(int i = 0 ; i< n;i++){
            dp[0][i] = 1;
        }

        //4、确定遍历顺序
        //dp[m][n]  是由dp[m-1][n] 和 dp[m][n-1]推导出来的

        for(int i = 1 ;i <m;i++){
            for(int j = 1 ;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }

        }

        //最终答案dp[m-1][n-1]
        return dp[m-1][n-1];

    }
}
