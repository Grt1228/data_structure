package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-14
 */
public class offer55_I {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;

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

        TreeNode root4L1 = new TreeNode(1);
        TreeNode root4R1 = new TreeNode(2);
        root3L1.left = root4L1;
        root3L1.right = root4R1;

        TreeNode root5L1 = new TreeNode(1);
        TreeNode root5R1 = new TreeNode(2);
        root4L1.left = root5L1;
        root4L1.right = root5R1;
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
