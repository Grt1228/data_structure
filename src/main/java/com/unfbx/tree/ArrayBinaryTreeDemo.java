package com.unfbx.tree;

/**
 * @Description
 * @Author Grt
 * @Date 2020-12-30
 */
public class ArrayBinaryTreeDemo {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);


        //arrayBinaryTree.preOrder();
        arrayBinaryTree.midOrder();
    }


}

class ArrayBinaryTree{

    /**
     * 存放数据节点的数组
     */
    private int[] tree;

    public ArrayBinaryTree(int[] array){
        this.tree = array;
    }

    public void preOrder(){
        this.preOrder(0);
    }
    public void midOrder(){
        this.midOrder(0);
    }

    public boolean isEntry(){
        if(this.tree == null || this.tree.length == 0){
            System.out.println("空树");
            return true;
        }
        return false;
    }

    //顺序存储二叉树的前序遍历
    public void preOrder(int index){
        //判断是不是空的
        isEntry();

        System.out.println(tree[index]);

        //向左边递归遍历
        if(index * 2 +1 < tree.length){
            preOrder(index * 2 +1);
        }

        //向右边递归遍历
        if(index * 2 +2 < tree.length){
            preOrder(index * 2 +2);
        }
    }


    //顺序存储二叉树的中序遍历
    public void midOrder(int index){
        //判断是不是空的
        isEntry();

        if(this.tree == null || this.tree.length == 0){
            System.out.println("空树");
            return;
        }

        //向左边递归遍历
        if(index * 2 +1 < tree.length){
            midOrder(index * 2 +1);
        }
        System.out.println(tree[index]);
        //向右边递归遍历
        if(index * 2 +2 < tree.length){
            midOrder(index * 2 +2);
        }
    }




}
