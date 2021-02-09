package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-02-08
 */
public class No112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {


        if(root == null ){
            return false;
        }
        if(root.left == null &&root.right == null && root.val == targetSum){
            return true;
        }

        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);

    }
    int sum = 0;
    public boolean hasPathSum1(TreeNode root, int targetSum) {


        if(root == null ){
            return false;
        }

        sum +=root.val;
        if(root.left == null &&root.right == null && sum == targetSum){
            return true;
        }else{
            sum = 0;
        }

        return hasPathSum(root.left,root.val) || hasPathSum(root.right, root.val);

    }
}
