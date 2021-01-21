package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-21
 */
public class No100 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root1L1 = new TreeNode(1);
        TreeNode root1R1 = new TreeNode(2);
        root1.left = root1L1;
        root1.right = root1R1;
        TreeNode root2 = new TreeNode(1);
        TreeNode root2L1 = new TreeNode(2);
        TreeNode root2R1 = new TreeNode(1);
        root2.left = root2L1;
        root2.right = root2R1;
        System.out.println(isSameTree(root1,root2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
