package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-25
 */
public class No108 {
    //取中间点为根节点

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }

        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int m = left + (right - 1) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = build(nums,left,m-1);
        root.right = build(nums,m+1,right);
        return root;
    }
}
