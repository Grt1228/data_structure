package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-25
 */
public class No700 {
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
        TreeNode bst = searchBST(root, 6);
        System.out.println(bst.val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return root;
        }

        if(root.val == val){
            return root;
        }

        if(root.val < val){
           return searchBST(root.right,val);
        }
        return searchBST(root.left,val);
    }
}
