package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 输入：4
 * 输出：
 * 解释：
 * 1. 1阶 + 1阶 +1阶 +1阶
 * 2. 2阶 +
 * 3. 1阶 + 1阶
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Grt
 * @Date 2021-01-15
 */
public class No70 {
    public static void main(String[] args) {
        //Long time1 = System.currentTimeMillis();
        //System.out.println(climbStairs1(100));
        Long time2 = System.currentTimeMillis();
        System.out.println(climbStairs2(45));
        Long time3 = System.currentTimeMillis();

        //System.out.println(time2-time1);
        System.out.println(time3-time2);

        System.out.println(climbStairs3(45));

    }
    /**
     * 动态规划
     * @param n
     * @return
     */
    public static int climbStairs3(int n) {
        //base case
        if(n<=2){
            return n;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2 ;i < dp.length ;i++){
            // 动态方程
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n-1];
    }


    /**
     * 普通递归解法
     * 大量的数据重复计算
     * @param n
     * @return
     */
    public static int climbStairs1(int n) {
        if(n<=2){
            return n;
        }
        int res = climbStairs1(n-1) + climbStairs1(n-2);
        return res;
    }

    /**
     * 缓存递归
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {
        Map<Integer ,Integer> map = new HashMap<>();
        return climbStairsStep(n,map);
    }

    /**
     * 增加缓存减少重复计算次数
     * @param n
     * @param map
     * @return
     */
    private static int climbStairsStep(int n, Map<Integer ,Integer> map) {
        int temp = 0;
        if(map.containsKey(n)){
            temp = map.get(n);
            return temp;
        }
        if(n <= 2){
            return n;
        }
        int cache =  climbStairsStep(n-1,map) + climbStairsStep(n-2,map);
        map.put(n,cache);
        return cache;
    }

    /**
     * 每次都有两种选择1或者2
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for(int i=3;i<=n;i++){
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }

    /**
     * 减少步长
     *
     * @param sum
     * @param step
     * @return
     */
    public static int reduce(int sum, int step) {

        return reduce(sum - 1, step) + reduce(sum - 2, step);
    }
}
