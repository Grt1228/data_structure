package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-25
 */
public class No98 {
    public static void main(String[] args) {
        No98 no98 = new No98();
        TreeNode root = new TreeNode();
        root.val = 5;
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(4);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        //t2.left = t6;
        t3.left = t5;
        System.out.println(no98.isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) {
            return false;
        }
        if (max != null && root.val >= max.val) {
            return false;
        }


        // 限定左子树的最大值是 root.val，右子树的最小值是 root.val
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    /**
     * 不正确不能满足所有节点，只能满足当前节点
     *
     * @param root
     * @return
     */
    public boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.val < root.left.val) {
            return false;
        }
        if (root.right != null && root.val > root.right.val) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
