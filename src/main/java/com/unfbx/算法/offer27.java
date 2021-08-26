package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-16
 */
public class offer27 {

    public TreeNode mirrorTree(TreeNode root){

//
//        mirrorTree(root.left);
//        mirrorTree(root.right);
//
//        return root;

        TreeNode tmpNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmpNode);

        return root;
    }
}
