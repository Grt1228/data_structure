package com.unfbx.tree;


/**
 * @Description
 * @Author Grt
 * @Date 2020-10-19
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        //创建一个二叉树
        BinaryTree binaryTree = new BinaryTree();

        TreeNode root = new TreeNode(1,"宋江");
        TreeNode node2 = new TreeNode(2,"吴用");
        TreeNode node3 = new TreeNode(3,"卢俊义");
        TreeNode node4 = new TreeNode(4,"林冲");
        TreeNode node5 = new TreeNode(5,"关胜");

        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node5);
        node3.setRight(node4);
        binaryTree.setRoot(root);

        //前序
//        System.out.println("前序");
//        binaryTree.preOrder();

        //中序
//        System.out.println("中序");
//        binaryTree.infixOrder();

        //后序
//        System.out.println("后序");
//        binaryTree.postOrder();

//        System.out.println(binaryTree.preOrderSearch(5));
//        System.out.println(binaryTree.infixOrderSearch(5));
//        System.out.println(binaryTree.postOrderSearch(5));

        System.out.println("删除前，前序遍历");
        binaryTree.preOrder();
        //binaryTree.delNode(5);
        binaryTree.delNode(3);
        System.out.println("删除后，前序遍历");
        binaryTree.preOrder();


    }

}

class BinaryTree{
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    /**
     * 前序遍历
     */
    public void preOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树为空，无法遍历");
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){
        if(this.root!=null){
            this.root.infixOrder();
        }else{
            System.out.println("二叉树为空，无法遍历");
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        if(this.root!=null){
            this.root.postOrder();
        }else{
            System.out.println("二叉树为空，无法遍历");
        }
    }

    /**
     * 前序遍历查找
     * @param no
     * @return
     */
    public TreeNode preOrderSearch(int no ){
        if(this.root!=null){
            return this.root.preOrderSearch(no);
        }else{
            System.out.println("二叉树为空，无法遍历");
            return null;
        }
    }

    /**
     * 中序遍历查找
     * @param no
     * @return
     */
    public TreeNode infixOrderSearch(int no ){
        if(this.root!=null){
            return this.root.infixOrderSearch(no);
        }else{
            System.out.println("二叉树为空，无法遍历");
            return null;
        }
    }

    /**
     * 后序遍历查找
     * @param no
     * @return
     */
    public TreeNode postOrderSearch(int no ){
        if(this.root!=null){
            return this.root.postOrderSearch(no);
        }else{
            System.out.println("二叉树为空，无法遍历");
            return null;
        }
    }

    /**
     * 删除节点
     */
    public void delNode(int no){
        if(root == null){
            System.out.println("树为空~~~~~~~~~~~~");
            return;
        }

        if(root.getNo() == no){
            root = null;
            return;
        }
        root.delNode(no);
    }
}

class TreeNode{

    private String name;
    private int no;
    /**
     * 默认为null
     */
    private TreeNode left;
    /**
     * 默认为null
     */
    private TreeNode right;

    public TreeNode(int no,String name ){
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        //先输出付姐点
        System.out.println(this);
        //递归左子树前序遍历
        if(this.left != null){
            this.left.preOrder();
        }
        //递归右子树前序遍历
        if(this.right != null){
            this.right.preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){

        //递归左子树中序遍历
        if(this.left != null){
            this.left.infixOrder();
        }
        //先输出父节点
        System.out.println(this);
        //递归右子树中序遍历
        if(this.right != null){
            this.right.infixOrder();
        }
    }
    /**
     * 后续遍历
     */
    public void postOrder(){

        //递归左子树中序遍历
        if(this.left != null){
            this.left.postOrder();
        }

        //递归右子树中序遍历
        if(this.right != null){
            this.right.postOrder();
        }
        //先输出父节点
        System.out.println(this);
    }

    /**
     * 前序遍历查找
     * @param no
     * @return
     */
    public TreeNode preOrderSearch(int no){
        System.out.println("进入前序遍历");
        if(this.no == no){
            return this;
        }
        TreeNode resNode = null;
        if(this.left != null){
            resNode = this.left.preOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }
        if(this.right != null){
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }

    /**
     * 中序遍历查找
     * @param no
     * @return
     */
    public TreeNode infixOrderSearch(int no){
        TreeNode resNode = null;
        if(this.left != null){
            resNode = this.left.infixOrderSearch(no);

        }

        if(resNode != null){
            return resNode;
        }
        System.out.println("进入中序遍历");
        if(this.no == no){
            return this;
        }

        if(this.right != null){
            resNode = this.right.infixOrderSearch(no);
        }
        return resNode;
    }

    /**
     * 后续遍历查找
     * @param no
     * @return
     */
    public TreeNode postOrderSearch(int no){
        TreeNode resNode = null;
        if(this.left != null){
            resNode = this.left.postOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }
        if(this.right != null){
            resNode = this.right.postOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }
        System.out.println("进入后序遍历");
        if(this.no == no){
            return this;
        }
        return resNode;
    }

    /**
     * 递归删除节点
     * 如果删除的节点是叶子节点，则删除改节点
     * 如果删除的节点是非叶子节点，则删除改子树
     * @param no
     */
    public void delNode(int no){
        if(this.left !=null && this.left.no == no){
            this.left = null;
            return;
        }
        if(this.right != null && this.right.no == no){
            this.right = null;
            return;
        }
        if(this.left != null){
            this.left.delNode(no);
        }
        if(this.right != null){
            this.right.delNode(no);
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
