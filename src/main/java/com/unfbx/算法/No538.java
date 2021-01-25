package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-25
 */
public class No538 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 5;
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(6);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(1);
        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t3.left = t5;
        No538 no538 = new No538();
        System.out.println(no538.convertBST(root));
    }

    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

     int sum = 0;

    private void traverse(TreeNode root) {

        if (root == null){
            return;
        }

        //先递归右子树
        traverse(root.right);
        sum = sum + root.val;
        root.val = sum;
        //再递归右子树
        traverse(root.left);
    }


}
