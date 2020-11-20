package com.unfbx.算法;

/**
 * @Description 一维数组的动态和
 * @Author Grt
 * @Date 2020-11-10
 */
public class No1480 {
    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     *
     * 请返回 nums 的动态和。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 示例 1：
     *
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
     * 示例 2：
     *
     * 输入：nums = [1,1,1,1,1]
     * 输出：[1,2,3,4,5]
     * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
     * 示例 3：
     *
     * 输入：nums = [3,1,2,10,1]
     * 输出：[3,4,6,16,17]
     *  
     *
     * 提示：
     *
     * 1 <= nums.length <= 1000
     * -10^6 <= nums[i] <= 10^6
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static int[] runningSum1(int[] nums) {
        if(nums == null || nums.length <= 0){
            return null;
        }

        if(nums.length == 1){
            return nums;
        }

        int[] res = new int[nums.length];
        for(int i = 0 ;i< nums.length ; i++){
            if(i == 0){
                res[i] = res[i] + nums[i];
                continue;
            }
            res[i] = res[i-1] + nums[i];
        }

        return res;
    }

    public static int[] runningSum2(int[] nums) {
        if(nums == null || nums.length <= 0){
            return null;
        }

        if(nums.length == 1){
            return nums;
        }

        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] runningSum = runningSum2(nums);
        System.out.println(runningSum);
    }
}
