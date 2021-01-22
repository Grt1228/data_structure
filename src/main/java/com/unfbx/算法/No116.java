package com.unfbx.算法;

/**
 * @Description
 * @Author Grt
 * @Date 2021-01-22
 */
public class No116 {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node root2 = new Node(2);
        Node root3 = new Node(3);
        Node root4 = new Node(4);
        Node root5 = new Node(5);
        Node root6 = new Node(6);
        Node root7 = new Node(7);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;

        connect(root1);
        System.out.println(root1);
    }

    public static Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectTwoNode(root.left,root.right);
        return root;
    }

    private static void connectTwoNode(Node node1, Node node2) {

        if (node1 == null || node2 == null) {
            return;
        }
        /**** 前序遍历位置 ****/
        // 将传入的两个节点连接
        node1.next = node2;

        // 连接相同父节点的两个子节点
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);
        // 连接跨越父节点的两个子节点
        connectTwoNode(node1.right, node2.left);

    }


    /**
     * 不能实现跨节点
     * @param root
     * @return
     */
    public static Node connect1(Node root) {
        if (root == null || root.left == null) {
            return null;
        }
        root.left.next = root.right;
        connect1(root.left);
        connect1(root.right);
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
