package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-08
 */
public class No376 {

    public static void main(String[] args) {
        int[] nums = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(wiggleMaxLength(nums));
    }

    public static int wiggleMaxLength(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }

        int currentDif = 0;//当前两个相邻 数字的差值
        int preDif = 0;//前一个差值
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            //当前差值
            currentDif = nums[i] - nums[i - 1];
            if ((currentDif > 0 && preDif <= 0) || (preDif > 0 && currentDif <= 0)) {
                preDif = currentDif;
                count++;
            }
        }
        return count;
    }
}
