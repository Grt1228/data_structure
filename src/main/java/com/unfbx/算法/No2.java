package com.unfbx.算法;

/**
 * @Description
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @Author Grt
 * @Date 2020-12-30
 */
public class No2 {

    public static void main(String[] args) {
        ListNodeO node1 = new ListNodeO(1);
        ListNodeO node2 = new ListNodeO(2);
        ListNodeO node3 = new ListNodeO(3);
        ListNodeO node4 = new ListNodeO(4);
        ListNodeO node5 = new ListNodeO(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.sout(node1);
        //ListNodeO l2 = new ListNodeO(5);

    }

    public ListNodeO addTwoNumbers(ListNodeO l1, ListNodeO l2) {

        return null;
    }
}

class ListNodeO {
    int val;
    ListNodeO next;
    ListNodeO() {}
    ListNodeO(int val) { this.val = val; }
    ListNodeO(int val, ListNodeO next) { this.val = val; this.next = next; }


    public void sout(ListNodeO nodeO){
        if(nodeO.next == null){
            System.out.println(nodeO.val);
            return;
        }
        sout(nodeO.next);
        System.out.println(nodeO.val);

    }
}
