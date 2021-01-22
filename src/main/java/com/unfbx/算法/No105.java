package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-22
 */
public class No105 {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        buildTree(preorder,inorder);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1);
    }
    //

    /*
       若前序遍历数组为 preorder[preStart..preEnd]，
       后续遍历数组为 postorder[postStart..postEnd]，
       构造二叉树，返回该二叉树的根节点
       https://mp.weixin.qq.com/s/OlpaDhPDTJlQ5MJ8tsARlA
    */
    public static TreeNode build(int[] preorder, int preStart, int preEnd,
                   int[] inorder, int inStart, int inEnd) {

        //root节点的值就是前序遍历数组的第一个元素
        int rootVal = preorder[preStart];

        //rootVal在后序遍历数组中的索引
        int index = 0;
        for (int i = inStart ; i<inEnd;i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }

        TreeNode root = new TreeNode(rootVal);
        int leftSize = index - inStart;
        // 递归构造左右子树
        root.left = build(preorder, preStart+1, preStart+leftSize,
                            inorder, inStart, index-1);

        root.right = build(preorder, preStart+leftSize+1, preEnd,
                            inorder, index+1, inEnd);
        return root;
    }
}
