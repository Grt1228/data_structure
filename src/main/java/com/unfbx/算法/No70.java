package com.unfbx.算法;

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
        System.out.println(climbStairs(3));
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
