package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-22
 */
public class No106 {
    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        TreeNode treeNode = buildTree(inorder, postorder);
        System.out.println(treeNode);
    }


    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0,inorder.length-1,
                    postorder,0,postorder.length-1);


    }
    public static TreeNode build(int[] inorder, int inStart,int inEnd,
                                 int[] postorder,int postStart,int postEnd){
        if(inStart > inEnd){
            return null;
        }
        //先找到根节点
        int rootValue = postorder[postEnd];
        //找到根节点在终于遍历中的索引
        int rootIndex = 0;
        for(int i = inStart;i <= inEnd;i++){
            if(rootValue == inorder[i]){
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int leftSize = rootIndex - inStart;
        root.left = build(inorder, inStart, rootIndex - 1, postorder, postStart, postStart+leftSize-1);
        root.right = build(inorder, rootIndex + 1, inEnd, postorder,postStart + leftSize , postEnd - 1);
        return root;
    }
}
