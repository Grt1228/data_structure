package com.unfbx.算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * // 输入: root = [5,3,6,2,4,null,null,1], k = 3
 * //       5
 * //      / \
 * //     3   6
 * //    / \
 * //   2   4
 * //  /
 * // 1
 * //输出: 3
 * @Author Grt
 * @Date 2021-01-25
 */
public class No230 {
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
        System.out.println(kthSmallest(root,1));
    }
    public static int kthSmallest(TreeNode root, int k) {
        //二叉搜索树本身有序，中序遍历后本身自带顺序
        List<Integer> tree = new ArrayList<>();
        mid(root,tree);
        return tree.get(k-1);
    }

    private static void mid(TreeNode root,List<Integer> tree) {
        if(root == null){
            return ;
        }
        mid(root.left,tree);
        tree.add(root.val);
        mid(root.right,tree);
    }
}
