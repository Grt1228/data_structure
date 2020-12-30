package com.unfbx.算法;

/**
 * @Description
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 * 示例 3：
 *
 * 输入：nums = [1,2,3]
 * 输出：0
 *  
 * 提示：
 *
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * @Author Grt
 * @Date 2020-12-29
 */
public class No1512 {
    public static void main(String[] args) {
        //int[] arr = {1,1,1,1};
        int[] arr = {1,2,3,1,1,3};
        //int[] arr = {1,2,3};
        System.out.println(numIdenticalPairs2(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int temp = 0;
        for(int i = 0 ; i<nums.length ;i++){

            for (int j = i+1 ;j <nums.length ;j++){
                if(nums[i] == nums[j]){
                    temp++;
                }
            }
        }

        return temp;
    }

    public static int numIdenticalPairs2(int[] nums) {
        int[] cnt = new int[101];
        int ans = 0;
        for (int num : nums) {
            ans += cnt[num];
            cnt[num]++;
        }
        return ans;
    }
}
