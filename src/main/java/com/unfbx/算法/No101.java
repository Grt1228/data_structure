package com.unfbx.算法;

/**
 * @Description
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 * @Author Grt
 * @Date 2021-02-07
 */
public class No101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val=1;

        TreeNode root1L1 = new TreeNode(1);
        TreeNode root1R1 = new TreeNode(1);
        root.left = root1L1;
        root.right = root1R1;
        TreeNode root2L1 = new TreeNode(1);
        TreeNode root2R1 = new TreeNode(2);
        root1L1.left = root2L1;
        root1L1.right = root2R1;

        TreeNode root3L1 = new TreeNode(2);
        TreeNode root3R1 = new TreeNode(1);
        root1R1.left = root3L1;
        root1R1.right = root3R1;

//        TreeNode root4L1 = new TreeNode(1);
//        TreeNode root4R1 = new TreeNode(2);
//        root3L1.left = root4L1;
//        root3L1.right = root4R1;

        System.out.println(isSymmetric(root));


    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isSymmetricStep(root.left,root.right);
    }

    private static boolean isSymmetricStep(TreeNode node1, TreeNode node2) {
        if(node1 == null  && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        if(node1.val != node2.val){
            return false;
        }

        return isSymmetricStep(node1.left,node2.right) && isSymmetricStep(node1.right,node2.left);
    }
}
