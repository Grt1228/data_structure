package com.unfbx.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-22
 */
public class No654 {
    public static void main(String[] args) {
        int[] array = {3,2,1,6,0,5};
        constructMaximumBinaryTree(array);
        Map map = new HashMap();
    }


    public static TreeNodeO constructMaximumBinaryTree(int[] nums) {

        TreeNodeO build = build(nums, 0, nums.length - 1);
        System.out.println(build);
        return build;
    }

    private static TreeNodeO build(int[] nums, int start, int end) {

        //求出数组中的最大值
        if(start > end){
            return null;
        }
        int maxValue = Integer.MIN_VALUE;;
        int index = -1;
        for(int i = start; i<= end;i++ ){
            if(nums[i] > maxValue){
                maxValue = nums[i];
                index = i;
            }
        }

        TreeNodeO root = new TreeNodeO(maxValue);

        //递归构建左右子树
        root.left = build(nums,start,index-1);
        root.right = build(nums,index+1,end);
        return root;
    }
}

class TreeNodeO {
    int val;
    TreeNodeO left;
    TreeNodeO right;
    TreeNodeO() {}
    TreeNodeO(int val) { this.val = val; }
    TreeNodeO(int val, TreeNodeO left, TreeNodeO right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
